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
//      String SQL = "CREATE TABLE users("+
//              "id SERIAL PRIMARY KEY,"+
//              "name VARCHAR(50) NOT NULL,"+
//              "last_name VARCHAR(50) NOT NULL,"+
//              "age SMALL INTEGER);";
//      try(Connection connection = Util.connection();
//          Statement statement = connection.createStatement()){
//          statement.executeUpdate(SQL);
//      }catch (SQLException e){
//          e.printStackTrace();
//      }


    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
     String SQL = "SELECT * FROM users";
     List<User> users= new ArrayList<>();
     try(Connection connection = Util.connection();
     Statement statement = connection.createStatement()){
         ResultSet resultSet = statement.executeQuery(SQL);
         while (resultSet.next()){
             User user = new User();

         }
     }catch (SQLException e){
         System.out.println(e.getMessage());
     }
        return null;
    }

    @Override
    public void cleanUsersTable() {
        Session session = Util.getsessionFactory().openSession();


    }
}
