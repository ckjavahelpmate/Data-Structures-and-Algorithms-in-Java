package com.dsa.recursion;

public class Q17_SubSetOfGivenNumber {

	public static void main(String[] args) 
	{
		subset(3, 0);
	}
	public static void subset(int n , int subSet)
	{
		if( n == 0 )
		{
			if( subSet != 0 )
			{
				System.out.println( subSet );
			}
			return;
		}
		//		to be added
		subset(n-1, subSet*10 + n);
		//		not to be added
		subset(n-1, subSet);

	}

}
