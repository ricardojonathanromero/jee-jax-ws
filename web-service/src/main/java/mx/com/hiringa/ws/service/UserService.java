package mx.com.hiringa.ws.service;

import jakarta.ejb.Local;
import mx.com.hiringa.ws.domain.User;

import java.util.List;

@Local public interface UserService {
    List<User> ListUsers();
    User FindUserById(User user);
    void AddUser(User user);
    void ModifyUser(User user);
    void DeleteUser(User user);
}
