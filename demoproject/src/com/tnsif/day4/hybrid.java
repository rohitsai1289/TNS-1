package com.tnsif.day4;


class Person {
 void display() {
     System.out.println("I am a person.");
 }
}


interface Worker {
 void work();
}


interface Learner {
 void learn();
}


class Student extends Person implements Learner {
 public void learn() {
     System.out.println("The student is learning.");
 }
}


class Employee extends Person implements Worker {
 public void work() {
     System.out.println("The employee is working.");
 }
}


class Intern extends Student implements Worker {
 public void work() {
     System.out.println("The intern is working as well as learning.");
 }
}


public class hybrid{
 public static void main(String[] args) {
     
     Student s = new Student();
     s.display();
     s.learn();

     System.out.println();

    
     Employee e = new Employee();
     e.display();
     e.work();

     System.out.println();

     Intern i = new Intern();
     i.display();
     i.learn();
     i.work();
 }
}
