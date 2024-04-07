package com.dsa.recursion;

// Factorial of number of characters will give number of permutation of String
// Ex :: "abc" ==> Factorial(3) ==> 6 Permutations

public class Q13_PermutationOfString 
{
	public static void main(String[] args) 
	{
		generatePermutation("ABC", 0, 3);
	}
	public static void generatePermutation(String str, int start, int end) 
	{
//		Base Condition
		if( start == end-1)
		{
			System.out.println(str); return;
		}
		for( int i = start ; i < end ; i++ )
		{
//			Swap
//			str = ;
//			Generate next permutation
			generatePermutation(swap(str, start, i), start+1, end);
//			swap string back 
//			str = swap(str, start, i);
		}
	}
	public static String swap(String str, int i , int j ) 
	{
		char[] ch = str.toCharArray();
		char temp = ch[i] ;
		ch[i] = ch[j];
		ch[j] = temp ;
		return String.valueOf(ch);
	}
}