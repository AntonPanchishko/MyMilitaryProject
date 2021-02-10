package dao;

import java.util.List;
import model.person.Person;

public interface PersonDao {
    void add(Person person);

    List<Person> getAll();
}
