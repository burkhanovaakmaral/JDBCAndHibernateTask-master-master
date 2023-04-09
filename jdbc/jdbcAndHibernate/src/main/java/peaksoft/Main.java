package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
       // userDaoJdbc.createUsersTable();
        userDaoJdbc.cleanUsersTable();
//        userDaoJdbc.saveUser("Anna","Kim", (byte) 25);
//        userDaoJdbc.saveUser("Janny","Den", (byte) 21);
//        userDaoJdbc.saveUser("Azamat","Baatyrov", (byte) 34);
//        userDaoJdbc.saveUser("Masha","Mishova", (byte) 45);
//        userDaoJdbc.saveUser("Den","Ben", (byte) 18);

        UserDaoHibernateImpl
    }
}
