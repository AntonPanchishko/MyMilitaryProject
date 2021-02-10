package dao;

import model.person.Person;

import java.util.List;

public interface PersonDao {
    void add(Person person);

    List<Person> getAll();
}
