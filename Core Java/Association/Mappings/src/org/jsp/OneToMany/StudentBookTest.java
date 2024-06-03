package org.jsp.OneToMany;

import java.util.Arrays;
import java.util.List;

public class StudentBookTest {
	public static void main(String[] args) {
	Student s = new Student();
	s.setId(1);
	s.setName("Naveen");
	List<Book> b = Arrays.asList(new Book("Maths", 789.90),
			new Book("Physics", 136.90),new Book("Chemistry", 600.67));
	s.setBooks(b);
	for(Book book :s.getBooks()) {
		System.out.println("Sudent Name --> " + s.getName()+" Books Issued "+ book.getBookName()+
				" Price of Book is --> "+ book.getPrice());
	}
}
}
