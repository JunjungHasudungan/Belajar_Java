// package com.tutorial;

class Product{
    // data member / attribute
    private String name;
    int amount = 0;

    Product(String inputName){
        this.name = inputName;
        this.amount += 1;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String inputName){
        this.name = inputName;
    }
}

public class Main{
    public static void main(String[] args) {
   
        // instance on object
        Product product1 = new Product("Lenovo");
        System.out.println( "No: \n" + "Product Name: "+ product1.getName() ); // before setting name
        product1.setName("Iphone");
        System.out.println("Product Name: " + product1.getName()); // after setting name
        product1.getName();
        
    }
}
