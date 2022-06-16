package com.cg.enums;

public class ExEnum {
	enum Day{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	public static void main(String[] args) {
		Day day = Day.SUNDAY;
		switch(day) {
		case SUNDAY:
			System.out.println("moving towards Monday");
			break;
		
		case FRIDAY:
			System.out.println("Its the weekend");
			break;
			
		default:
			System.out.println("other day");
		}
	}

}
