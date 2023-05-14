package org.example.relations;

import org.example.database.DatabaseConfig;
import org.example.relations.entity.Animal;
import org.example.relations.entity.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ManyToOneMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Owner person1 = new Owner(null, "Toby", new ArrayList<>());
        Animal pet1 = new Animal(null,"Mittens","Cat",person1);
        person1.addPet(pet1);

        session.persist(pet1);




        transaction.commit();
        session.close();

    }
}
