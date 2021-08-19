package ru.eshmakar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GettingCars {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new  Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Cars car = session.get(Cars.class, 5);//получаем 5 ый элемент, и печатаем
        System.out.println(car);
        session.close();
        sessionFactory.close();
        
    }
}
