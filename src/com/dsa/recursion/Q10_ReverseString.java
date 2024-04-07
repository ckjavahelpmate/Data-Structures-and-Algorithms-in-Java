package com.dsa.recursion;

public class Q10_ReverseString {

	public static void main(String[] args) 
	{
		System.out.println( reverse("Java class"));
	}
	public static String reverse(String str) 
	{
		if( str.equals(""))
		{
			return "" ;
		}
		return str.charAt(str.length()-1 )+ reverse(str.substring(0, str.length()-1 ));
	}

}
