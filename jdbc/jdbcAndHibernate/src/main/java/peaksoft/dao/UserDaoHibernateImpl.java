package peaksoft.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import peaksoft.model.User;
import peaksoft.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {

    public UserDaoHibernateImpl() {

    }

    @Override
    public void createUsersTable() {
        Util.getSessionFactory();


    }

    @Override
    public void dropUsersTable() {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        session.createSQLQuery("DROP TABLE IF EXISTS users").executeUpdate();
        session.getTransaction().commit();
        session.close();


    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setAge(age);
        session.save(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully saved users");


    }

    @Override
    public void removeUserById(long id) {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.remove(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully removed user");
    }

    @Override
    public List<User> getAllUsers() {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        List<User> users = new ArrayList<>();
        users = session.createQuery("FROM User ").getResultList();
        session.getTransaction().commit();
        session.close();
        return users;
    }

    @Override
    public void cleanUsersTable() {
        Session session = Util.getSessionFactory().openSession();
        session.beginTransaction();
        session.createQuery("Delete User").executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successful deleted users table");


    }
}
