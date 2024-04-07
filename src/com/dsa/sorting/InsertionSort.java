package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) { 
		int[] arr = { 1, 3, 4, 5, 6, 2 };
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) 
	{
		for (int i = 1; i < arr.length; i++) 
		{
			int pickedEle = arr[i] ;
			int j = i ;
			while( j > 0 && pickedEle < arr[j-1] )
			{
				arr[j] = arr[j-1] ;
				j-- ;
			}
			arr[j] = pickedEle ;
		}
	}

}
