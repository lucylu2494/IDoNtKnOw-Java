package org.example;



public class Main {
    public static void main(String[] args) {

        Person Lucille = new Person(22, "Lucille", "Cowherd");
        System.out.println(Lucille.getAge());

        Person[] peopleArray = new Person[5];
        peopleArray[0] = Lucille;
        peopleArray[1] = new Person(20, "Jiwoo", "Hang");
        peopleArray[2] = new Person(63, "Patricia", "Petroski");
        peopleArray[3] = new Person(39, "Nathan", "Russell");
        peopleArray[4] = new Person(21, "Ali", "Ferguson");

        for (Person person : peopleArray) {
            System.out.println("Here is a new person shown below!");
            System.out.println("\t" + person.getFirstName() + " " + person.getLastName());
            System.out.println("\tAge: " + person.getAge());
        }
    }
}