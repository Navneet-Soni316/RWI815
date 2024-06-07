package com.jsp.UsingThrow;

import java.io.IOException;

public class DemoForCheckedException {
	public static void  play() throws IOException{
		throw new IOException();
		
	}
	public static void start() throws Exception  {
		play();
	}
public static void main(String[] args) {
	try {
		DemoForCheckedException.start();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		System.out.println("Hello Im finally block");
	}
	
	System.out.println("Hello");
}
}
