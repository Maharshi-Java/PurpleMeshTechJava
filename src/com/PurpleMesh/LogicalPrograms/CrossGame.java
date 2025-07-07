package com.PurpleMesh.LogicalPrograms;

import java.util.Random;
import java.util.Scanner;

public class CrossGame {

<<<<<<< HEAD
	
	public static void main(String[] args) {
		
		initialBoard();
		printBord();
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Your Turn : Enter row and column");
			
			int row,col;
			
			while(true)
			{
				
				System.out.println("Enter Row Value(0-2): ");
				row=scanner.nextInt();
				System.out.println("Enter Colum Value(0-2): ");
				col=scanner.nextInt();
				
				if(valid(row, col))
				{
					bord[row][col]='X';
					break;
				}
				else {
					System.out.println("Enter a Valid Number: ");
				}
				
			}
			printBord();
			if(checkwin('X'))
			{
				System.out.println("You Win");
				break;
			}
			
			System.out.println("Computers Turn:");
			
			while(true)
			{
				row=random.nextInt(3);
				col=random.nextInt(3);
				System.out.println("Computer Placed at row: "+row + "Colum: "+ col);
				if(valid(row, col))
				{
					bord[row][col]='O';
					break;
				}
				else {
					System.out.println("Enter a Valid Number: ");
				}
				
			}
			printBord();
			
			if(checkwin('O'))
			{
				System.out.println("You Win");
				break;
			}
			

	}
		scanner.close();
	}
	
	
	
	static char[][] bord =new char[3][3];
	
	static void initialBoard() {
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				bord[i][j]='-';
			}
		}
	}
	
	static void printBord()
	{
		System.out.println("Print Bord");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
=======
	static char[][] bord = new char[3][3];

	static void initialBoard() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bord[i][j] = '-';
			}
		}
	}

	static void printBord() {
		System.out.println("Print Bord");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
>>>>>>> 7a66887 (second commit)
				System.out.print(bord[i][j] + " ");
			}
			System.out.println();
		}
	}
<<<<<<< HEAD
	
	static boolean  valid(int row,int col)
	{
		return row>=0 && row<3 && col>=0 && col<3 && bord[row][col]=='-';
	}
	
	static boolean checkwin(char symbol)
	{
		for(int i=0;i<3;i++)
		{
			if(bord[i][0]== symbol && bord[i][1] == symbol && bord[i][2]== symbol ||
					bord[0][i]== symbol && bord[1][i] == symbol && bord[2][i]== symbol ) {
				return true;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			if( bord[0][0]== symbol && bord[1][1]==symbol && bord[2][2] == symbol ||
					bord[0][2] == symbol && bord[1][1] == symbol && bord[2][0]== symbol
					)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	

}

=======

	static boolean valid(int row, int col) {
		return row >= 0 && row < 3 && col >= 0 && col < 3 && bord[row][col] == '-';
	}

	static boolean checkwin(char symbol) {
		for (int i = 0; i < 3; i++) {
			if (bord[i][0] == symbol && bord[i][1] == symbol && bord[i][2] == symbol
					|| bord[0][i] == symbol && bord[1][i] == symbol && bord[2][i] == symbol) {
				return true;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (bord[0][0] == symbol && bord[1][1] == symbol && bord[2][2] == symbol
					|| bord[0][2] == symbol && bord[1][1] == symbol && bord[2][0] == symbol) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		initialBoard();
		printBord();
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Your Turn : Enter row and column");

			int row, col;

			while (true) {

				System.out.println("Enter Row Value(0-2): ");
				row = scanner.nextInt();
				System.out.println("Enter Colum Value(0-2): ");
				col = scanner.nextInt();

				if (valid(row, col)) {
					bord[row][col] = 'X';
					break;
				} else {
					System.out.println("Enter a Valid Number: ");
				}

			}
			printBord();
			if (checkwin('X')) {
				System.out.println("You Win");
				break;
			}

			System.out.println("Computers Turn:");

			while (true) {
				row = random.nextInt(3);
				col = random.nextInt(3);
				System.out.println("Computer Placed at row: " + row + "Colum: " + col);
				if (valid(row, col)) {
					bord[row][col] = 'O';
					break;
				} else {
					System.out.println("Enter a Valid Number: ");
				}

			}
			printBord();

			if (checkwin('O')) {
				System.out.println("You Win");
				break;
			}

		}
		scanner.close();
	}

}
>>>>>>> 7a66887 (second commit)
