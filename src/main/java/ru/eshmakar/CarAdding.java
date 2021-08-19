package ru.eshmakar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CarAdding {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //добавляем элементы
        Cars car1 = new Cars("LADA");
        Cars car2 = new Cars("BMW");
        Cars car3 = new Cars("MERSEDES");
        Cars car4 = new Cars("BUGATTI");
        Cars car5 = new Cars("CAMRI");

        //сохраняем все это добро в базе
        session.save(car1);
        session.save(car2);
        session.save(car3);
        session.save(car4);
        session.save(car5);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
