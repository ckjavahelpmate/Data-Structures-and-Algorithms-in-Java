package com.dsa.recursion;

// 2^Number of characters will give number of Subsequence of String
// Ex :: "abc" ==> 2^3 ==> 8 Subsequences are possible

public class Q12_SubSequenceOfString {

	public static void main(String[] args) 
	{
		subSequence("abc", 0, "");
	}
	public static void subSequence(String str,int index, String newString) 
	{
//		Base condition
		if( index == str.length() )
		{
			System.out.println(newString);return;
		}
		char currentChar = str.charAt(index);
//		To be
		subSequence(str, index+1, newString+currentChar );
//		NOt to be
		subSequence(str, index+1, newString);
	}

}
