package com.tnsif.day6;

	class This1 {
		int a = 10;
		public void show () {
			int a = 20;
			System.out.println("Local Variable: " + a);    
			System.out.println("Instance Variable: " + this.a);    
		}
	}
	public class This {

		public static void main(String[] args) {
			
			This1 s = new This1();
			s.show();
		}

	}