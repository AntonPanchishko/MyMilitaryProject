package service;

import java.util.List;
import model.person.Person;

public interface PersonService {
    void add(Person person);

    List<Person> getAll();
}
