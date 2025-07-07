package com.PurpleMesh.DataStructurePrograms;

import com.PurpleMesh.Utility.Utility;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("Enter Year:");
		int year = Utility.getNextInt();

		System.out.println("Enter Month(1-12):");
		int month = Utility.getNextInt();

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			daysInMonth[1] = 29;

		}

		int totalDays = 0;

		for (int y = 1; y < year; y++) {
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
				totalDays += 366;
			else {
				totalDays += 365;
			}
		}

		for (int m = 0; m < month - 1; m++) {
			totalDays += daysInMonth[m];

		}

		int startDay = totalDays % 7;

		System.out.println(months[month - 1]+ " "+year);

		System.out.println("Mon Tus Wed Thu Fri Sat sun");

		
		
		int numOfDays = daysInMonth[month - 1];
		
		String[][] calendar = new String[6][7];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				calendar[i][j] = "   ";
			}
		}


		int day = 1;
		int week = 0;

		for (int i = startDay; day <= numOfDays; i++) {
			if (i == 7) {
				i = 0;
				week++;
			}
			calendar[week][i] = String.format("%2d ", day);
			day++;
		}

		
		for (int i = 0; i < 6; i++) {
			boolean isEmptyWeek = true;
			for (int j = 0; j < 7; j++) {
				if (!calendar[i][j].equals("   ")) {
					isEmptyWeek = false;
					break;
				}
			}
			if (isEmptyWeek) break; 
			for (int j = 0; j < 7; j++) {
				System.out.print(calendar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
