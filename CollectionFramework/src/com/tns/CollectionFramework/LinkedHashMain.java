package com.tns.CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashMain {
	public static void main(String[] args)
	{
		LinkedHashSet link =new LinkedHashSet();
		link.add("Lakshan");
		link.add("pass");
		link.add("blood group");
		link.add("AB+");
		Object[] a=link.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
