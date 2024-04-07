package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Q18_FindSafePlaceForNQueensInChessBoard {

	public static void main(String[] args) {
		int n = 4;
		List<List<String>> allBoards = findSafePlaces(n);
		if (allBoards.size() != 0) {
			for (int i = 0; i < allBoards.size(); i++) {
				List<String> board = allBoards.get(i) ;
				for (int j = 0; j < board.size(); j++) {
					for (int j2 = 0; j2 < board.size(); j2++) {
						System.out.print(allBoards.get(i).get(j2).charAt(j) + "  ");
					}
					System.out.println();
				}
				System.out.println("=".repeat(500));
			}
		} else {
			System.out.println("No safe Places");
		}

	}

	public static List<List<String>> findSafePlaces(int n) {
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];
		helper(board, allBoards, 0);
		return allBoards;
	}

	public static void helper(char[][] broad, List<List<String>> allBoards, int col) {
		if (col == broad.length) {
			saveBoard(broad, allBoards);
			return;
		}
		for (int row = 0; row < broad.length; row++) {
			if (isSafe(row, col, broad)) {
				broad[row][col] = 'Q';
				helper(broad, allBoards, col + 1);
				broad[row][col] = '.';
			}
		}
	}

	private static void saveBoard(char[][] broad, List<List<String>> allBoards) {
		List<String> newBoard = new ArrayList<String>();
		for (int i = 0; i < broad.length; i++) {
			String row = "";
			for (char ch : broad[i]) {
				if (ch == 'Q') {
					row += ch;
				} else {
					row += '.';
				}
			}
			newBoard.add(row);
		}
		allBoards.add(newBoard);
	}

	private static boolean isSafe(int row, int col, char[][] broad) {
		// Horizontal
		for (int i = 0; i < broad.length; i++) {
			if (broad[row][i] == 'Q') {
				return false;
			}
		}
		// Vertical
		for (int i = 0; i < broad.length; i++) {
			if (broad[row][i] == 'Q') {
				return false;
			}
		}
		// Top Left
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (broad[i][j] == 'Q') {
				return false;
			}
		}
		// Top Right
		for (int i = row, j = col; i >= 0 && j < broad.length; i--, j++) {
			if (broad[i][j] == 'Q') {
				return false;
			}
		}
		// Bottom Left
		for (int i = row, j = col; i < broad.length && j >= 0; i++, j--) {
			if (broad[i][j] == 'Q') {
				return false;
			}
		}
		// Bottom Right
		for (int i = row, j = col; i < broad.length && j < broad.length; i++, j++) {
			if (broad[i][j] == 'Q') {
				return false;
			}
		}
		return true;
	}

}
