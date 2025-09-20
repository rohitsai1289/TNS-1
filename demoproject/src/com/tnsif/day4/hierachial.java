package com.tnsif.day4;


class Vehicle {
 void start() {
     System.out.println("The vehicle starts.");
 }
}


class Car extends Vehicle {
 void drive() {
     System.out.println("The car is being driven.");
 }
}


class Bike extends Vehicle {
 void ride() {
     System.out.println("The bike is being ridden.");
 }
}


public class hierachial {
 public static void main(String[] args) {
     
     Car car = new Car();
     car.start();  
     car.drive();

     System.out.println();

     
     Bike bike = new Bike();
     bike.start();  
     bike.ride();
 }
}
