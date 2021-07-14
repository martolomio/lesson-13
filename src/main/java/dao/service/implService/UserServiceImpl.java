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
    private static Logger LOGGER= Logger.getLogger(ProductServiceImpl.class);
    private UserDoa userDao;
    private  static UserServiceImpl userServiceImpl;

    private  UserServiceImpl(){
        try {
            userDao = new UserDaoImpl();
        } catch (SQLException throwables) {
            LOGGER.error(throwables);
        } catch (ClassNotFoundException e) {
            LOGGER.error(e);
        } catch (InvocationTargetException e) {
            LOGGER.error(e);
        } catch (InstantiationException e) {
            LOGGER.error(e);
        } catch (IllegalAccessException e) {
            LOGGER.error(e);
        } catch (NoSuchMethodException e) {
            LOGGER.error(e);
        }
    }

    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public User read(Integer id) throws SQLException {
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
