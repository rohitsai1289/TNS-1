package com.tnsif.day6;

	class Parent {
		int a = 10;
	}

	class Child extends Parent {
		int a = 20;
		public void show() {
			int a = 30;
			int res = a + this.a + super.a; 
			System.out.println("Sum of all variables: " + res);
		}

	}
	public class Super {

		public static void main(String[] args) {
			
			Child ch = new Child();
			ch.show();
		}

	}
     
