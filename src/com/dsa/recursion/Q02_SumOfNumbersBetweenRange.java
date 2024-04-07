package com.dsa.recursion;

public class Q02_SumOfNumbersBetweenRange {

	public static void main(String[] args) 
	{
		System.out.println( sum(1, 6));
	}
	public static int sum(int m, int n) 
	{
		if( m == n )
		{
			return m ;
		}
		
		return m + sum( m+1 , n)  ;
	}

}
