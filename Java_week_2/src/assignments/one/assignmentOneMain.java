package assignments.one;

import java.util.ArrayList;

public class assignmentOneMain {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("it4a", "piet", "piet@gmail.com");
        persons[1] = new Student("it4a", "jan", "jan@gmail.com");
        persons[2] = new Teacher(3000, "peter", "peter@gmail.com");
        persons[3] = new Teacher(3000, "pieter", "pieter@gmail.com");

        for (Person person : persons) {
            person.display();
            if(person instanceof Teacher) {
                System.out.printf("yearly salary: %s %n", ((Teacher) person).salary * 12);
            }
        }
    }
}
