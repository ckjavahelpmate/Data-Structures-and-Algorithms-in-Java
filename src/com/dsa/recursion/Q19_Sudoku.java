package com.dsa.recursion;

public class Q19_Sudoku {

	public static void main(String[] args) {
		char[][] board = new char[9][9];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '.';
			}
		}
		helper(board, 0, 0);
		printSudoku(board);
	}

	public static void printSudoku(char[][] board) {
		int rline = 1;
		for (char[] cs : board) {
			int cline = 1;
			for (char cs2 : cs) {
				System.out.print(cs2 + " ");
				if (cline == 3) {
					System.out.print("|");
					cline = 1;
				} else {
					cline++;
				}
			}
			System.out.println();
			if (rline == 3) {
				System.out.println("---------------------");
				rline = 1;
			} else {
				rline++;
			}
		}
	}

	public static boolean helper(char[][] board, int row, int col) {
// 		Check for last row
		if (row == board.length) {
			return true;
		}
// 		find the next coordinates
		int nRow = 0;
		int nCol = 0;
		if (col != board.length - 1) {
			nRow = row;
			nCol = col + 1;
		} else {
			nRow = row + 1;
			nCol = 0;
		}
//		 check number present if != '.' means number present then move to next
//		 coordinates
		if (board[row][col] != '.') {
			if (helper(board, nRow, nCol)) {
				return true;
			}
		} else // if number is not present the put 1 number from 1-9
		{
			for (int i = 1; i <= 9; i++) {
//				Check is i safe to place(vertically / Horizontally / In grid)
				if (isSafe(board, row, col, i)) {
//					if safe to place i then store i by converting number to character
					board[row][col] = (char) (i + '0');
					if (helper(board, nRow, nCol)) {
//						 if next places also numbers placed safely then return true
						return true;
					} else {
//						 if next places not safe to place numbers then Backtrack and change the placed number 
						board[row][col] = '.';
					}
				}
			}
		}
		return false;
	}

	private static boolean isSafe(char[][] board, int row, int col, int number) {
//		Check Vertical and Horizontal
		for (int i = 0; i < board.length; i++) {
//			Check Vertically
			if (board[i][col] == (char) (number + '0')) {
				return false;
			}
//			Check Horizontally
			if (board[row][i] == (char) (number + '0')) {
				return false;
			}
		}
//		find particular grid
		int startRow = (row / 3) * 3;
		int startCol = (col / 3) * 3;
//		Check Grid
		for (int i = startRow; i < startRow + 3; i++) {
			for (int j = startCol; j < startCol + 3; j++) {
				if (board[i][j] == (char) (number + '0')) {
					return false;
				}
			}
		}
		return true;
	}

}
