package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Person> list = new ArrayList<>();

    public void getPerson(Person person){
        list.add(person);
    }

    public void goToRosStat() throws IOException {
        FileOutputStream fos = new FileOutputStream("person.bin");
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        for (Person person: list){
            if (person.getAge() >= 65){
                ous.writeObject(person);
            }
        }
        ous.close();
    }
}
