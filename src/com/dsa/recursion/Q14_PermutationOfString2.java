package com.dsa.recursion;

public class Q14_PermutationOfString2 {

	public static void main(String[] args) 
	{
		permutations("ABC", "");

	}
	public static void permutations(String str, String permutation) 
	{
		if( str.length() == 0 )
		{
			System.out.println(permutation);
			return ;
		}
		for(int i = 0 ; i < str.length() ; i++ )
		{
			char currentChar = str.charAt(i);
			String newString = str.subSequence(0, i) + str.substring(i+1);
			permutations(newString, permutation+currentChar);
		}
	}

}
