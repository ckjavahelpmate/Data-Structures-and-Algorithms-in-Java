package com.dsa.recursion;

public class Q06_FindXPowerNValue {

	public static void main(String[] args) 
	{
		System.out.println( pow(7, 3) );
	}
	public static int pow(int base , int power) 
	{
		if( power == 1 )
		{
			return base ;
		}
		return base * pow( base, power - 1 ) ;
	}

}
