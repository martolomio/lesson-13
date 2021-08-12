package dao.service.implService;

import dao.UserDoa;
import dao.impl.UserDaoImpl;
import dao.service.UserService;
import domain.User;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDoa userDao;
    private  static UserServiceImpl userServiceImpl;

    private  UserServiceImpl(){
            userDao = new UserDaoImpl();

    }

    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public User read(Integer id) {
        return userDao.read(id);
    }

    @Override
    public User update(User user) {
        return userDao.create(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    public List<User> readAll() {
        return userDao.readAll();
    }

    public  static  UserService getUserService(){
        if (userServiceImpl == null){
            userServiceImpl = new UserServiceImpl();
        }
        return  userServiceImpl;
    }
    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

}
