package com.tnsif.day5;

class Example{  
	int data=20;
	void show() {
		System.out.println("This is Default method");
	}
}

public class Default {

	public static void main(String[] args) {
		Example e=new Example();
		System.out.println(e.data);
		e.show();
	}

}