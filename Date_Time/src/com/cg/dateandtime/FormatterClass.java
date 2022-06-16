package com.cg.dateandtime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FormatterClass {
	public static void main(String[] args)
	{
		LocalDateTime dateobj = LocalDateTime.now();
		System.out.println("Before formatting what is your date? "+dateobj);
		DateTimeFormatter formatobj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
			String formattedDate = dateobj.format(formatobj);
			System.out.println("After formatting the date is : " +formattedDate);
	}

}
	