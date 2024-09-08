package db.interaction;

import java.time.LocalDate;

import org.hibernate.Session;


public class Db {

    public static void con(){

        Connector con = new Connector();
        Session session= con.getSession();

        Person person = new Person("John", "Lennon", LocalDate.of(1940, 10, 9));
        session.persist(person);

        person = new Person("Paul", "Smith", LocalDate.of(1969, 3, 9));
        session.persist(person);

        person = new Person("Christian", "Abbot", LocalDate.of(2000, 1, 4));
        session.persist(person);

        session.getTransaction().commit();
        session.close();
    }

}
