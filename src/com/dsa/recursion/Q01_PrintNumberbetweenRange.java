package com.dsa.recursion;

public class Q01_PrintNumberbetweenRange 
{
	public static void main(String[] args) 
	{
		print( 10, 20 );
	}
	public static void print(int start , int end) 
	{
		if( start > end )
		{
			return ;
		}
		System.out.println(start);
		print( start + 1 , end ) ;
	}
}
