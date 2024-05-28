package com.jsp;

public class DemoMethod {

		String word= "People";
	//non-static with no-arguements and no return type
		public void print() { 
			System.out.println("Playing football");
		}
		
		//non-static with no-arguements and return type
		public int sum() {
			return 2+78;
		
		}
		//non-static with arguements and return type
		public String printWord(String name) {
			return name;
		}
		
		//static with arguements and no-return type
		public static void printNumber(int num) {
			System.out.println(num);
		}
		
		public static void main(String[] args) {
			DemoMethod dem = new DemoMethod();
			dem.print();
			System.out.println(dem.sum());
			System.out.println(dem.printWord("Mahadev"));
			DemoMethod.printNumber(70);
		}
	}


