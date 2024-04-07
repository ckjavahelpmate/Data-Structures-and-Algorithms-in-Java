package com.dsa.recursion;

public class Q11_MoveAllxToEnd {

	public static void main(String[] args) 
	{
		String str = "axbcxxd" ;
		
		System.out.println(moveAllx(str, 0, 0, "")) ;
			
	}
	public static String moveAllx(String str, int index, int count, String newString)
	{
		if( index == str.length())
		{
			 for( int i = 1 ; i <= count ; i++ )
			 {
				 newString += 'x' ;
			 }
			 return newString ;
		}
		if( str.charAt(index) == 'x' || str.charAt(index) == 'X')
		{
			count++ ;
		}
		else
		{
			newString += str.charAt(index);
		}
		return moveAllx(str, index+1, count, newString) ;
	}

}
