package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person, LocalTime entryTime) {
        if (person.getTicket().entryTime().isAfter(entryTime)) {
            throw new IllegalArgumentException("Unable to enter yet!");
        }
        people.add(person);
    }

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }
}
