package com.dsa.recursion;

public class Q05_FibonacciSequence {

	public static void main(String[] args)
	{
		System.out.println( fib(10));
	}
	public static int fib(int n ) 
	{
		if( n <= 1 )
		{
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}
