package com.bridgelabz;

public class TicTacToeGame {
	private static char[] element;
	
		public static void main(String args[]) {
			System.out.println("Welcome To The Tic Tac Toe Game !!!");
			boardCreation();
		}
		private static void boardCreation() {
			element =new char [10];
			for (int i = 1 ; i<10 ; i++) {
				element[i]=' ';
			}
			System.out.println("Empty Board Creation");
		}
}