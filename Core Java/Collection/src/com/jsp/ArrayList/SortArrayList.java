package com.jsp.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList  {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("Pushpa");
		al.add("Kanika");
		al.add("Ammata");
		Collections.sort(al);
		System.out.println(al);
		
	}


}
