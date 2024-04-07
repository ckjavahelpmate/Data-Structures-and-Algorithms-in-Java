package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		int[] arr = { 5, 1, 6, 4, 3, 2 };
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr.length-1; j++) 
			{
				if( arr[j] > arr[j+1] )
				{
					int temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
				}
			}
		}
	}
}
