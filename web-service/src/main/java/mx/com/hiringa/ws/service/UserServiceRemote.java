package mx.com.hiringa.ws.service;

import jakarta.ejb.Remote;
import mx.com.hiringa.ws.domain.User;

import java.util.List;

@Remote public interface UserServiceRemote {
    List<User> ListUsers();
    User FindUserById(User user);
    void AddUser(User user);
    void ModifyUser(User user);
    void DeleteUser(User user);
}
