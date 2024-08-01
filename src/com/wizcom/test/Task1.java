package com.wizcom.test;

import java.util.Scanner;

/*Task: Missing Char
Description: 
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn" */

public class Task1 
{
    public static String missingChar(String str, int num) 
    {
    	
    	str=str.substring(0, num) + str.substring(num + 1);
    	return str;
    }

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println(missingChar(sc.next(), sc.nextInt())); 
        
    }
}

