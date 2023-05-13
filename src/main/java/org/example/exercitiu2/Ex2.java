package org.example.exercitiu2;

import org.example.database.DatabaseConfig;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class Ex2 {
    public static void main(String[] args) {

        Session session = DatabaseConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student stud1 = new Student(1, "Maria",1987);
        Student stud2 = new Student(2, "George",1996);
        Student stud3 = new Student(3, "Nicu",1967);

        session.persist(stud1);
        session.persist(stud2);
        session.persist(stud3);



        transaction.commit();
        session.close();

    }
}
