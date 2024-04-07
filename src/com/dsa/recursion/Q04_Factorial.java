package com.dsa.recursion;

public class Q04_Factorial {

	public static void main(String[] args) 
	{
		System.out.println( fact(5) );
	}
	public static int fact(int num) 
	{
		if( num == 1 )
		{
			return 1 ;
		}
		return num * fact( num - 1 ) ;
	}

}
