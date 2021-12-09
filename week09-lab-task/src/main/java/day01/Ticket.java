package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String band;
    private LocalDateTime when;
    private int price;

    public Ticket(String band, LocalDateTime when, int price) {
        this.band = band;
        this.when = when;
        this.price = price;
    }

    public LocalTime entryTime() {
        return when.toLocalTime().minusHours(1);
    }

    public String getBand() {
        return band;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public int getPrice() {
        return price;
    }
}
