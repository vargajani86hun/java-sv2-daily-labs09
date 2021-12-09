package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void testCreate() {
        Concert concert = new Concert();
        assertEquals(0, concert.getPeople().size());
    }

    @Test
    void testAddPeople() {
        Concert maidenConcert = new Concert();
        maidenConcert.addPerson(new Person(new Ticket("Iron Maiden",
                LocalDateTime.of(2022, 6, 7, 19, 30),
                22_900)), LocalTime.of(18,30));
        assertEquals(1, maidenConcert.getPeople().size());
        maidenConcert.addPerson(new Person(new FrontOfStageTicket("Iron Maiden",
                LocalDateTime.of(2022, 6, 7, 19, 30),
                28_900, "Tíz százalék V.I.P")), LocalTime.of(17, 30));
        assertEquals(2, maidenConcert.getPeople().size());
    }

    @Test
    void testAddPeopleBeforeAvailable() {
        Concert maidenConcert = new Concert();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> maidenConcert.addPerson(new Person(new Ticket("Iron Maiden",
                LocalDateTime.of(2022, 6, 7, 19, 30),
                22_900)), LocalTime.of(18,29)));
        assertEquals("Unable to enter yet!", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class,
                () -> maidenConcert.addPerson(new Person(new FrontOfStageTicket("Iron Maiden",
                        LocalDateTime.of(2022, 6, 7, 19, 30),
                        28_900, "Tíz százalék V.I.P")), LocalTime.of(17,29)));
        assertEquals("Unable to enter yet!", iae.getMessage());
    }
}