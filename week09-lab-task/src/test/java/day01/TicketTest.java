package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void testCreate() {
        Ticket ticket = new Ticket("Iron Maiden",
                LocalDateTime.of(2022, 6, 7, 19, 30),
                22_900);
        assertEquals("Iron Maiden", ticket.getBand());
        assertEquals(22_900, ticket.getPrice());
        assertEquals(6, ticket.getWhen().getMonthValue());
        assertEquals(19, ticket.getWhen().getHour());
    }

    @Test
    void testEntryTime() {
        Ticket ticket = new Ticket("Iron Maiden",
                LocalDateTime.of(2022, 6, 7, 19, 30),
                22_900);
        assertEquals(LocalTime.of(18,30), ticket.entryTime());
    }
}