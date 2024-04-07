package com.dsa.recursion;

public class Q03_SumOfEvenNumbersBetweenRange {

	public static void main(String[] args) 
	{
		System.out.println( sum(5, 8));
	}
	public static int sum(int m, int n) 
	{
		if( m == n )
		{
			if( m%2==0)
			{
				return m ;
			}
			return 0 ;
		}
		if( m%2 == 0 )
		{
			return m + sum(m+1 , n);
		}
		return sum(m+1 , n) ;
	}

}
