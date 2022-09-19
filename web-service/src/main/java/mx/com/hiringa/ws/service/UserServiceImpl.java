package mx.com.hiringa.ws.service;

import jakarta.annotation.Resource;
import jakarta.ejb.SessionContext;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import mx.com.hiringa.ws.dao.UserDao;
import mx.com.hiringa.ws.domain.User;

import java.util.List;

@WebService(endpointInterface = "mx.com.hiringa.ws.service.UserServiceWS")
@Stateless public class UserServiceImpl implements UserService, UserServiceRemote {
    @Inject UserDao repository;

    @Resource SessionContext context;

    @Override public List<User> ListUsers() { return repository.findAll(); }

    @Override public User FindUserById(User user) {
        return null;
    }

    @Override public void AddUser(User user) { repository.createUser(user); }

    @Override public void ModifyUser(User user) {
        try {
            repository.updateUser(user);
        } catch (Throwable t) {
            context.setRollbackOnly();
            t.printStackTrace(System.out);
        }
    }

    @Override public void DeleteUser(User user) { repository.deleteUser(user); }
}
