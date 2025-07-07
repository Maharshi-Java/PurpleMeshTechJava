package com.PurpleMesh.FunctionalPrograms;

import com.PurpleMesh.Utility.Utility;

public class TwoDimenctionalArray {

	public static int[][] readInt2DArray(int row,int column)
	{
		System.out.println("Enter "+ (row*column)+ "numbers:");
		int[][] array = new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]= Utility.scanner.nextInt();
			}
		}
		return array;
	}
	public static void printInt2DArray(int[][] intArray,int row,int column)
	{
		Utility.printWriter.println("2D Array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				Utility.printWriter.print(intArray[i][j]+ " ");
			}
			Utility.printWriter.println();
		}
		
	}
	
	
	public static double[][] readDouble2DArray(int row,int column)
	{
		System.out.println("Enter "+ (row*column)+ "numbers:");
		double[][] array = new double[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]= Utility.scanner.nextDouble();
			}
		}
		return array;
	}
	public static void printDouble2DArray(double[][] doubleArray,int row,int column)
	{
		Utility.printWriter.println("2D Array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				Utility.printWriter.print(doubleArray[i][j]+ " ");
			}
			Utility.printWriter.println();
		}
		
	}
	public static boolean[][] readBoolean2DArray(int row,int column)
	{
		System.out.println("Enter "+ (row*column)+ "numbers:");
		boolean[][] array = new boolean[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]= Utility.scanner.nextBoolean();
			}
		}
		return array;
	}
	public static void printBoolean2DArray(boolean[][] booleanArray,int row,int column)
	{
		Utility.printWriter.println("2D Array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				Utility.printWriter.print(booleanArray[i][j]+ " ");
			}
			Utility.printWriter.println();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		int row= Utility.scanner.nextInt();
		
		System.out.println("Enter Number of columns : ");
		int column = Utility.scanner.nextInt();
		
		System.out.println("Chose array type:int/double/boolean ");
		String type = Utility.scanner.next().toLowerCase();
		
		switch (type)
		{
		case "int":
			System.out.println("Enter Int Values: ");
			int[][] intArray=readInt2DArray(row,column);
			printInt2DArray(intArray, row, column);
			break;
		case "double":
			System.out.println("Enter Int Values: ");
			double[][] doubleArray=readDouble2DArray(row,column);
			printDouble2DArray(doubleArray, row, column);
			break;
		case "boolean":
			System.out.println("Enter Int Values: ");
			boolean[][] booleanArray=readBoolean2DArray(row,column);
			printBoolean2DArray(booleanArray, row, column);
			break;
			
		}
		
		
		
	}



	
}
