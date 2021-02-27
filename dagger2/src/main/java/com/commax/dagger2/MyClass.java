package com.commax.dagger2;

public class MyClass {
    public static void main(String[] args){

        //member-injection method
        CoffeeMaker coffeemaker = new CoffeeMaker();
        DaggerCoffeeComponent.create().inject(coffeemaker);
        coffeemaker.brew();



        //Provision method
       DaggerCoffeeComponent.create().coffeeMaker().brew();


    }
}