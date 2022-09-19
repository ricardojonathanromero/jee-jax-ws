package mx.com.hiringa.ws.service;

import jakarta.annotation.Resource;
import jakarta.ejb.SessionContext;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import mx.com.hiringa.ws.dao.PersonDao;
import mx.com.hiringa.ws.domain.Person;

import java.util.List;

@WebService(endpointInterface = "mx.com.hiringa.ws.service.PersonServiceWS")
@Stateless public class PersonServiceImpl implements PersonServiceRemote, PersonService {
    @Inject PersonDao repo;

    @Resource private SessionContext context;

    @Override public List<Person> ListPersons() { return repo.findAll(); }

    @Override public Person FindPersonById(Person person) { return repo.findPersonById(person); }

    @Override public Person FindPersonByEmail(Person person) {
        return repo.findPersonByEmail(person);
    }

    @Override public void AddPerson(Person person) {
        repo.createPerson(person);
    }

    @Override
    public void ModifyPerson(Person person) {
        try {
            repo.updatePerson(person);
        } catch (Throwable t) {
            context.setRollbackOnly();
            t.printStackTrace(System.out);
        }
    }

    @Override public void DeletePerson(Person person) { repo.deletePerson(person); }
}
