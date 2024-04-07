package com.dsa.recursion;

public class Q08_ReverseNumber {

	public static void main(String[] args) 
	{
		System.out.println( reverse(456));
	}
	public static int reverse(int num ) 
	{
		if( num == 0 )
		{
			return 0 ;
		}
		return (num%10)*(int)(Math.pow(10, (int)Math.log10(num))) + reverse(num/10) ;
	}

}
