// package com.tutorial;

class Human{
    // data member
    String name;
    int age;
    int amount = 0;

    Human(String inputName, int inputAge)
    {
        this.name = inputName;
        this.age = inputAge;
        this.amount += 1;
    }

    void info()
    {
        System.out.println("No: "+ amount++ + "\nName: " + name + "\nAge: " + age + "\n");
    }
}

public class Main{
    public static void main(String[] args) {
        
        // instance object
        Human human1 = new Human("Caca Cahyana", 24);
        Human human2 = new Human("Resti Ginting", 23);
        Human human3 = new Human("Barista", 25);
        
        human1.info();
        human2.info();
        human3.info();
    }
}