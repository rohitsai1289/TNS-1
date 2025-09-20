package com.tnsif.day5;

class Parent{
	protected void display()
	{
		System.out.println("Protected Method");
	}
}
public class Protected extends Parent{

	public static void main(String[] args) {
		Protected obj=new Protected();
		obj.display();
		

	}

}