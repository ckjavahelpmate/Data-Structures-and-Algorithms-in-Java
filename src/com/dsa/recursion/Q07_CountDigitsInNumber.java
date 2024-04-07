package com.dsa.recursion;

public class Q07_CountDigitsInNumber {

	public static void main(String[] args) 
	{
		System.out.println( count(458762));
	}
	public static int count(int num) 
	{
		if( num == 0 )
		{
			return 0 ;
		}
		return 1 + count( num/10) ;
	}

}
