package org.example.relations;

import org.example.database.DatabaseConfig;
import org.example.relations.entity.Child;
import org.example.relations.entity.Food;
import org.example.relations.entity.Mother;
import org.example.relations.entity.Toy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneMain {
    public static void main(String[] args) {
        Session session = DatabaseConfig.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Food pizza = new Food(1,"Pizza",2000,false);
        session.persist(pizza);
        Food cake = new Food(2,"Cake",2500,false);
        session.persist(cake);
        Food humus = new Food(3,"Humus",300,true);
        session.persist(humus);

        Toy car = new Toy(1,"Red Car");
        Toy doll = new Toy(2,"Barbie Doll");
        Toy pokemon = new Toy(3,"Pokemon Doll");



        Child billy = new Child(1, "Billy",pizza,car);
        session.persist(billy);

        Child mary = new Child(2, "Mary",cake,pokemon);
        session.persist(mary);

        Child louise = new Child(3, "Louise",humus,doll);
        session.persist(louise);

/*        Mother mom1 = new Mother(1,"Mommy 1", Job.DOCTOR);
        session.persist(mom1);
        Mother mom2 = new Mother(2,"Mommy 2", Job.LAWYER);
        session.persist(mom2);
        Mother mom3 = new Mother(3,"Mommy 3", Job.BRICK_LAYER);
        session.persist(mom3);*/

        transaction.commit();

        Transaction t2 = session.beginTransaction();
        session.remove(billy);
        t2.commit();
        session.close();




    }
}
