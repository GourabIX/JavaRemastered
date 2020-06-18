package com.gourabix;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Gourab");
        person.setLastName("Sarkar");
        person.setAge(23);
        System.out.println("Is " + person.getFullName() + " a teen? " + person.isTeen() + ".");
        System.out.println("In fact, " + person.getFirstName() + "'s age is " + person.getAge() + ".");

        System.out.println("----------------------------------------");

        Person person1 = new Person();
        person1.setFirstName("Sam");
        person1.setLastName("");
        person1.setAge(42);
        System.out.println(person1.getFullName() + " is one of the most versatile and capable SpecOps officers.");
        System.out.println(person1.getFirstName() + "'s age is " + person1.getAge() + ".");
    }
}
