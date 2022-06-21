package com.tns.CollectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args)
	{
		SortedSet<String> obj=new TreeSet<>();
		obj.add("technology");
		obj.add("Quiz");
		obj.add("Code");
		obj.add("technical");
		
		System.out.println("Tree set elements:" +obj);
		System.out.println("First:"+obj.first());
		System.out.println("last:"+obj.last());
	}

}
