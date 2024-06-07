package org.jsp.Assignment;

public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.charAt(12));
		}
		catch (Exception e) {
			
			System.out.println("Can't access the character at particular index");
			e.printStackTrace();
		}
	}
}
