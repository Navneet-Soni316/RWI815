package com.jsp.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Arraylist {
public static void main(String[] args) {
	System.out.println("Hello");
	ArrayList<Object> al = new ArrayList<>();
	al.add("Pushpa");
	al.add(67);
	al.add("Mangal");
	System.out.println("The size of an arrayList ---> "+ al.size());
	System.out.println("Searching for an element in arrayList --> "+ al.contains(67));
	System.out.println("Traversing the arraylist --> ");
	Iterator i = al.iterator();
	System.out.println(al);
	while(i.hasNext())	 {
		System.out.println(i.next());
//	    i.remove();
		
	}
//	System.out.println(al);
//	ArrayList<Object> dem = new ArrayList<>(5);
//	System.out.println("The size of an arrayList --> "+ dem.size());
//	dem.add("Pushpa1");
//	dem.add(607);
//	dem.add("Mangal1");
//	dem.add("Pushpa2");
//	dem.add(679);
//	dem.add("Mangal2");
//	System.out.println(dem);
//	al.addAll(dem);
//	System.out.println(al.indexOf("Pushpa2"));
//	System.out.println(al.equals(dem));
//	System.out.println("al --> "+al);
//	System.out.println("dem--> "+dem);
//	System.out.println(al.retainAll(dem));
//	dem.add("Nav");
//	System.out.println(al.retainAll(dem));
//	System.out.println("For each method");
//	al.forEach(x->System.out.println(x));
}
}
