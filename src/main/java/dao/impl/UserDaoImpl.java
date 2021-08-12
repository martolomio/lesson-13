package dao.impl;

import dao.UserDoa;
import domain.User;
import org.apache.log4j.Logger;
import sheard.FactoryManager;
import utils.ConnectionUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDoa {
    private EntityManager em = FactoryManager.getEntityManager();

    @Override
    public User create(User user) {
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User read(Integer id) {
        User user = null;
        try {
            user = em.find(User.class, id);
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<User> readAll() {
        List<User> userRecords = new ArrayList<User>();
        try {

        }  catch (Exception e) {
            e.printStackTrace();
        }
        return userRecords;
    }

    @Override
    public User getUserByEmail(String email) {
        User user = null;
            try {
                CriteriaBuilder builder = em.getCriteriaBuilder();
                CriteriaQuery<User> criteria = builder.createQuery(User.class);
                Root<User> from = criteria.from(User.class);
                criteria.select(from);
                criteria.where(builder.equal(from.get("email"), email));
                TypedQuery<User> typed = em.createQuery(criteria);
                user = typed.getSingleResult();

            }  catch (Exception e) {
                e.printStackTrace();
            }
            return user;

    }
}