package dao.impl;

import model.person.Person;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements dao.PersonDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Person person) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert military person " + person, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Person> getAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("SELECT p FROM Person p", Person.class)
                    .getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Persons not found", e);
        }
    }
}
