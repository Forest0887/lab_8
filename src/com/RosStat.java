package com;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RosStat {
    private ArrayList<Person> people = new ArrayList<>();

    public void accept_data() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (true){
            try {
                people.add((Person)ois.readObject());
            }
            catch (EOFException exceptionObject) {
                ois.close();
                break;
            }
        }
    }

    public void average_amount(){
        int a_a = 0;
        int i = 0;
        for (Person person: people){
            i++;
            a_a = a_a + person.getSum();
        }
        a_a = a_a/i;
        System.out.println(a_a);
    }
}
