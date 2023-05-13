package org.example.relations;

import org.example.relations.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GeneratedIdMain {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Mother.class)
                .addAnnotatedClass(Food.class)
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Toy.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Mother mom = new Mother(null, "Mommy", Job.DOCTOR);
        System.out.println("Before persistence Mom's id is: " + mom.getId());
        session.persist(mom);
        System.out.println("After persistence Mom's id is: " + mom.getId());



        transaction.commit();
        session.close();
    }


}
