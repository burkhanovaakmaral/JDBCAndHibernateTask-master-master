package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
        userDaoJdbc.createUsersTable();
        userDaoJdbc.saveUser("Anna", "Kim", (byte) 25);
        userDaoJdbc.saveUser("Janny", "Den", (byte) 21);
        userDaoJdbc.saveUser("Azamat", "Baatyrov", (byte) 34);
        userDaoJdbc.saveUser("Masha", "Mishova", (byte) 45);
        userDaoJdbc.saveUser("Kanat", "Subanov", (byte) 23);
        userDaoJdbc.cleanUsersTable();
        userDaoJdbc.dropUsersTable();

        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.dropUsersTable();

    }
}
