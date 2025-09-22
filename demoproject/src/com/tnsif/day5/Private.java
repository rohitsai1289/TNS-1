
	package com.tnsif.day5;
	

	class Student {
	    private int age; 

	   
	    public void setAge(int a) {
	        age = a;
	    }

	    public int getAge() {
	        return age;
	    }
	}

	public class Private {
	    public static void main(String[] args) {
	        Student s = new Student();

	       
	        s.setAge(20);   
	        System.out.println("Age: " + s.getAge());
	    }
	}
	
