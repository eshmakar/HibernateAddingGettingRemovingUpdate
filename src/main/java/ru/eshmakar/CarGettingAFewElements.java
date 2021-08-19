package ru.eshmakar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;

//получаем несколько элементов
public class CarGettingAFewElements {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        //выводим все данные
//        List<Cars> carsList = session.createQuery("from Cars").getResultList();//здесь Cars - это название класса
//        carsList.forEach(System.out::println);//выводим на консоль

        //выводим только то, что совпадает с запросом
//        List<Cars> carsList = session.createQuery("from Cars c where c.name='LADA'").getResultList();
//        carsList.forEach(System.out::println);

        //либо можно выводить по параметру
        List<Cars> list = session.createQuery("from Cars c where c.name=:name")//здесь :name - означает, что здесь будет какой-то аргумент (параметр)
                .setParameter("name", "LADA")//здесь подставляем в аргумент наше слово
                .getResultList();
        list.forEach(System.out::println);




        factory.close();
        session.close();


    }
}
