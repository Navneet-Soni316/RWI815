package com.jsp.CollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List l =  new ArrayList();
	l.add(23);
	l.add(1, "Good");
    l.add(2,false);
    ArrayList<String > arr = new ArrayList<String>();
    arr.add("Ganga");
    arr.add("Jamuna");
    arr.add("Nile");
    arr.add("Paris");
    l.addAll(arr);
    System.out.println(l);
}
}
