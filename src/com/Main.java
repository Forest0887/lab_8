package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("Карл", 20, 583, 100);
        Person p2 = new Person("Стив", 70, 634, 20);
        Person p3 = new Person("Меган", 66, 823, 15);
        Person p4 = new Person("Фред", 80, 237, 100);

        Restaurant restaurant = new Restaurant();
        restaurant.getPerson(p1);
        restaurant.getPerson(p2);
        restaurant.getPerson(p3);
        restaurant.getPerson(p4);

        restaurant.goToRosStat();

        RosStat rosStat = new RosStat();

        rosStat.accept_data();

        rosStat.average_amount();
    }
}
