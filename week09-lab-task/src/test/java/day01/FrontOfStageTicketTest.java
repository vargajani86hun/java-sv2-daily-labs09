package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {

    @Test
    void testCreate() {
        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Iron Maiden",
                LocalDateTime.of(2022, 6, 7, 19, 30),
                28_900, "Tíz százalék V.I.P");
        assertEquals("Iron Maiden", frontOfStageTicket.getBand());
        assertEquals(28_900, frontOfStageTicket.getPrice());
        assertEquals("Tíz százalék V.I.P", frontOfStageTicket.getExtraCode());
        assertEquals(2022, frontOfStageTicket.getWhen().getYear());
        assertEquals(7, frontOfStageTicket.getWhen().getDayOfMonth());
    }

    @Test
    void testEntryTime() {
        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Iron Maiden",
                LocalDateTime.of(2022, 6, 7, 19, 30),
                28_900, "Tíz százalék V.I.P");
        assertEquals(LocalTime.of(17, 30), frontOfStageTicket.entryTime());
    }
}