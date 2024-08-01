package com.wizcom.test;
/*Task: 3 --> Max Int
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3 */

import java.util.Arrays;
import java.util.Scanner;

public class Task3 
{
	static int intMax(int[] a)
	{
		//Arrays.sort(a);
		//return a[a.length-1];
		int max=0;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(intMax(arr));
	}

}
