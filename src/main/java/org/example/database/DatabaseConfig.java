package org.example.database;

import org.example.exercitiu2.Student;
import org.example.relations.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DatabaseConfig {
    private static SessionFactory sessionFactory = null;

    private DatabaseConfig(){
    }

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            sessionFactory = new Configuration()
                    .configure("hibernate.config.xml")
                    .addAnnotatedClass(Student.class)
                    .addAnnotatedClass(Mother.class)
                    .addAnnotatedClass(Hobby.class)
                    .addAnnotatedClass(Food.class)
                    .addAnnotatedClass(Child.class)
                    .addAnnotatedClass(Toy.class)
                    .addAnnotatedClass(TvShows.class)
                    .addAnnotatedClass(Animal.class)
                    .addAnnotatedClass(Owner.class)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
