package com.tutorial;

class Human{
    
    // data member / atribute
    String name;
    int age;
    int amount  = 0;

    // construct
    Human( String inputName, int inputAge){
        this.name = inputName;
        this.age = inputAge;
        this.amount += 1;
    }
}


public class Main {
    public static void main(String[] args)  {

    Human human1 = new Human("Caca Cahyana", 24);
    Human human2 = new Human("Rendi Sugiono", 23);
        System.out.println("No:" + human1.amount);
        System.out.println("Name: " + human1.name);
        System.out.println("Age: " + human1.age + "\n");
        System.out.println("No:" + human2.amount);
        System.out.println("Name: " + human2.name);
        System.out.println("Age: " + human2.age);
    }
}
