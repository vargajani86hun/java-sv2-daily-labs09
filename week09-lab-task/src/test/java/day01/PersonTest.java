package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreate() {
        Person person = new Person(new Ticket("Iron Maiden",
                LocalDateTime.of(2022, 6, 7, 19, 30),
                22_900));
        assertEquals("Iron Maiden", person.getTicket().getBand());
        assertEquals(22_900, person.getTicket().getPrice());
    }

}