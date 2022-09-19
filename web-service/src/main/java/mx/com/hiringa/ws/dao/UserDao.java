package mx.com.hiringa.ws.dao;

import mx.com.hiringa.ws.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
