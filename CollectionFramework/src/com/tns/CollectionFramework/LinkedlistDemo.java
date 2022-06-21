package com.tns.CollectionFramework;

import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args)
	{
		LinkedList <String> names =new LinkedList<>();
		
		names.add("John");
		names.add("Lakshan");
		names.add("Sonu");
		names.add("Joel");
		names.addFirst("Chris");
		names.addLast("jj");
		System.out.println("Initial list: "+names);
		names.offer("Anne");
		System.out.println("Final list:"+names);
	}

}
