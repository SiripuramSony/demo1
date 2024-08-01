package com.wizcom.test;

import java.util.Scanner;

/*Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue" */
public class Task5 
{
	public static void seeColor(String str)
	{
		if(str.substring(0,3).equals("red")) 
		{
			System.out.println("red");
		}
		else if(str.substring(0,4).equals("blue"))
		{
			System.out.println("blue");
		}
		else
		{
			str.startsWith(str);
			System.out.println("");
		}
		
	}
	static int factorial(int num)
	{
		if(num==0 || num==1)
		{
			return num;
		}
		return num * factorial( num-1);

	}
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
//		seeColor(sc.next());
		System.out.println(factorial(5));
		

	}

}
