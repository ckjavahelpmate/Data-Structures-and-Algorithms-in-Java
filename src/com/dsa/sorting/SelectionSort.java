package com.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 3, 2, 6 };
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) 
	{
		for (int i = 0; i < arr.length - 1; i++) 
		{
			int smallestIndex = i;
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[j] < arr[smallestIndex]) 
				{
					smallestIndex = j;
				}
			}
			if (i != smallestIndex) 
			{
				int temp = arr[i];
				arr[i] = arr[smallestIndex];
				arr[smallestIndex] = temp;
			}

		}
	}

}
