package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final List<Person> members = new ArrayList<>();

    public void addMember(Person person) {
        members.add(person);
    }
    

    public void sortMembers() {
        members.sort((current, next) -> current.getSurname().compareTo(next.getSurname()));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person member : members) {
            result.append(member).append("\n");
        }
        return result.toString();

    }

}
