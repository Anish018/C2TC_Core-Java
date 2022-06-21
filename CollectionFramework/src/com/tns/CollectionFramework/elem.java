package com.tns.CollectionFramework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class elem {
	public static void main(String[] args)
	{
		
		Set <String>str= new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements : ");
		for(int i=0;i<4;i++)
		{
			str.add(sc.nextLine());
		}
		

		System.out.println("the elements are : "+str);	
		System.out.println("The number of elements are : "+str.size());
	}

}
