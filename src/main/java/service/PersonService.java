package service;

import model.person.Person;

import java.util.List;

public interface PersonService {
    void add(Person person);

    List<Person> getAll();
}
