package com;

import java.io.Serializable;

public class Person implements Serializable {
    private transient String name;
    private int age;
    private int card_number;
    private int sum;

    public Person(String name, int age, int card_number, int sum){
        this.name = name;
        this.age = age;
        this.card_number = card_number;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCard_number() {
        return card_number;
    }

    public int getSum() {
        return sum;
    }
}
