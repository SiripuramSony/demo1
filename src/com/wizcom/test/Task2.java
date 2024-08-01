package com.wizcom.test;

import java.util.Scanner;

/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
Ex:
1. mixStart("mix snacks") → true
2. mixStart("pix snacks") → true
3. mixStart("piz snacks") → false */


public class Task2 
{
	static Boolean mixStart(String str)
	{
		if(str.charAt(1)=='i' && str.charAt(2)=='x')
		{
			return true;
		}
		return false;
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(mixStart(sc.nextLine()));

	}

}
