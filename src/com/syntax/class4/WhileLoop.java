package com.syntax.class4;

public class WhileLoop {

	public static void main(String[] args) {
		int time = 8;

		if (time < 12) {
			System.out.println("Good morning");// code executes 1
		}
		while (time < 12) {
			System.out.println("Good morning");// codes execute infinitely
			time++;// stops infinite looping

		}
		System.out.println("*********************");
		
		int i=-1;
		while(i<4) {
			System.out.println("Good afternoon");
			i++;
			

		}
		System.out.println("Outside of while loop");
		System.out.println();
		System.out.println("****************************");
	
		
		Boolean workDay = true;
		int day = 1;

		while (workDay) {

			if (day==6 || day==7) {
				System.out.println("I do not need  a day off anymore");
				workDay = false;
			} else {
				System.out.println("I need a day off");
			}

			day++;
		}
		//print only even numbers from 1-2 using while loop
		System.out.println("**********************");
		int num=1;
		while (num<=20) {
			if(num%2==0) {
				System.out.println(num);
				
			}
			num++;
		} 
		
		System.out.println("**********************");
		
		
		
	}

}
