package mx.com.hiringa.ws.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import mx.com.hiringa.ws.domain.Person;

import java.util.List;

@WebService public interface PersonServiceWS {
    @WebMethod List<Person> ListPersons();
}
