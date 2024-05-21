package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westley", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aidan", 17));

        Collections.sort(myFamily);

        for (Person person : myFamily) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
        }
    }
}
