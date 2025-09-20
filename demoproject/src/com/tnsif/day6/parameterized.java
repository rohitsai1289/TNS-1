package com.tnsif.day6;
	
	class Student {
	    String name;
	    int age;

	    
	    Student(String n, int a) {
	        name = n;
	        age = a;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

	public class parameterized {
	    public static void main(String[] args) {
	        
	        Student s1 = new Student("Rohit", 21);
	        Student s2 = new Student("Poojitha", 20);

	        s1.display();
	        s2.display();
	    }
	}