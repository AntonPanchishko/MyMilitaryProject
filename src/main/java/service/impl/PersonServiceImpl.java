package service.impl;

import dao.PersonDao;
import java.util.List;
import model.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonDao personDao;

    @Autowired
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void add(Person person) {
        personDao.add(person);
    }

    @Override
    public List<Person> getAll() {
        return personDao.getAll();
    }
}
