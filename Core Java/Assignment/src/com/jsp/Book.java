package com.jsp;

public class Book {
	String name;
	String author;
	Integer num_pages;
	
	public Book(String name, String author, Integer num_pages) {
		this.name = name;
		this.author = author;
		this.num_pages = num_pages;
	}

	public String get_short_summary() {
		return "Book [name=" + name + ", author=" + author + ", num_pages=" + num_pages + "]";
	}
	public static void main(String[] args) {
		Book b = new Book("Physics", "Hc Verma", 220);
		System.out.println(b.get_short_summary());
	}
	
}
