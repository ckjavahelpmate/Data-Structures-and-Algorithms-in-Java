package com.dsa.recursion;

public class Q16_GuestCallingWays {

	public static void main(String[] args)
	{
		System.out.println( countways(3) );
	}
	public static int countways(int n)
	{
		if( n <= 1 )
		{
			return 1 ;
		}
//		single
		int  single = countways(n-1) ;
		
//		Pairing
		int pair = (n-1) * countways(n-2) ;
		
		return single + pair ;
	}

}
