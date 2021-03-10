package com.tutorial;
    class Human{
        int age;
        String name;
        int amount = 0;

        // Constructor 
        Human( int inputAge, String inputName){
            age = inputAge;
            name = inputName;
            amount += 1;
        }
    }

public class Main {
   
    public static void main(String[] args) {
        
        // instance an object
        Human human1 = new Human( 25, " Hasudungan "); 
        System.out.println("Name \t:" + human1.name + "\n"+"Age\t: " + human1.age);
    } 
}
