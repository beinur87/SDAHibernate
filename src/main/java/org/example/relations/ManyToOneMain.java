package org.example.relations;

import org.example.database.DatabaseConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ManyToOneMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();





        transaction.commit();
        session.close();

    }
}
