package ru.eshmakar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CarUpdate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Cars car = session.get(Cars.class, 5);//получаем 5 ый элемент по id
        car.setName("Volga");//и меняем название
        session.getTransaction().commit();//сохраняем в базе
        session.close();
        sessionFactory.close();
    }
}
