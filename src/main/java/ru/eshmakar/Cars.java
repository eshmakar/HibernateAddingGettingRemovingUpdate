package ru.eshmakar;

import javax.persistence.*;

@Entity//указываем, что это будет таблица
@Table
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//чтобы автоматический генерировался id
    @Column(name = "id")//можно указать название столбца, который будет в базе
    private int id;

    @Column//включаем это поле тоже в базу
    private String name;

    public Cars() {//без пустого конструктора не работает
    }
//без геттеров и сеттеров тоже не работает
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cars(String name) {
        this.name = name;
    }

    //чтобы красиво все выводит на консоль
    @Override
    public String toString() {
        return "Car " +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }
}
