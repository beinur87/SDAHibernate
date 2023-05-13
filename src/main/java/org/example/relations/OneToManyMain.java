package org.example.relations;

import org.example.database.DatabaseConfig;
import org.example.relations.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneToManyMain {
    public static void main(String[] args) {

        Session session = DatabaseConfig.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();

        Hobby h1 = new Hobby(null, "Cycling","Moderate" );
        session.persist(h1);
        Hobby h2 = new Hobby(null, "Swimming","Easy" );
        session.persist(h2);

        TvShows show1 = new TvShows(null,"Meet the fockers", Genre.COMEDY );
        TvShows show2 = new TvShows(null,"Night of the living dead", Genre.HORROR );
        TvShows show3 = new TvShows(null,"Interstellar", Genre.SCIFI );
        TvShows show4 = new TvShows(null,"Rufus", Genre.DRAMA );


        Mother m1 = new Mother(null, "Manuela", Job.UNEMPLOYED, List.of(h1,h2), List.of(show1,show2,show3,show4));

        session.persist(m1);

        t1.commit();
        session.close();
    }
}
