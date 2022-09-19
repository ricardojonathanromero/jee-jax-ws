package mx.com.hiringa.ws.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import mx.com.hiringa.ws.domain.User;

import java.util.List;

@WebService public interface UserServiceWS {
    @WebMethod List<User> ListUsers();
}
