package com.tnsif.day6;

public class Final {
	final int x=10;
	final void display()
	{
		System.out.println("Final Method in parent class");
	}
	void show()
	{
		
		System.out.println("x="+x);
	}
	}
class Child1 extends Final{
	
}
final class parent{
	void demo()
	{
		System.out.println("Final Class");
	}
}