package com.dsa.recursion;

public class Q15_CountTotalPathsInMazeToMoveFromMToN {

	public static void main(String[] args) 
	{
		System.out.println( countMoves(1, 0, 3, 3) );
	}
	public static int countMoves(int i, int j , int m , int n) 
	{
		if( i == m || j == n )
		{
			return 0 ;
		}
		if( i == m-1 && j == n-1 )
		{
			return 1 ;
		}
		int downCount = countMoves(i+1, j, m, n);
		int rightCount = countMoves(i, j+1, m, n);
		
		return downCount + rightCount ;
	}

}
