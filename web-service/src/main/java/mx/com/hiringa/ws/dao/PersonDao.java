package mx.com.hiringa.ws.dao;

import mx.com.hiringa.ws.domain.Person;

import java.util.List;

public interface PersonDao {
    List<Person> findAll();
    Person findPersonById(Person person);
    Person findPersonByEmail(Person person);
    void createPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Person person);
}
