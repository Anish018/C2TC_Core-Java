package com.cg.stringbuffer;

public class Buffer {
	public static void main(String[] args)
	{
		String str="study";
		str.concat("night");
		System.out.println(str);
		
		StringBuffer str1 = new StringBuffer("study");
		str1.append("night");
		System.out.println(str1);
	}

}
