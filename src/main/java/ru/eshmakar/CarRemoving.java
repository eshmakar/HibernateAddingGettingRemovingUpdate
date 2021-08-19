package ru.eshmakar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CarRemoving {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();//подключаемся
        Session session = factory.openSession();//открываем сессию
        session.beginTransaction();//начинаем транзакцию
        Cars car = session.get(Cars.class, 3);//получаем 3 элемент по id
        session.delete(car);//удаляем
        session.getTransaction().commit();//сохраняем в базе
        session.close();//чтобы не висели
        factory.close();
    }
}
