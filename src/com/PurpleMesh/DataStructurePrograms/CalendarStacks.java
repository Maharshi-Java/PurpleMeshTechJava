package com.PurpleMesh.DataStructurePrograms;

import com.PurpleMesh.Utility.Utility;

public class CalendarStacks {
	
	public static void main(String[] args) {
		System.out.println("Enter Year:");
		int year = Utility.getNextInt();

		System.out.println("Enter Month(1-12):");
		int month = Utility.getNextInt();

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		 String[] weekDays = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

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

		int numOfDays = daysInMonth[month - 1];
		
		int currentDate=1;
		
		StackQueue<Week> calendarQueue = new StackQueue<>();

		
		while (currentDate <= numOfDays) {
            Week week = new Week();

            for (int i = 0; i < 7; i++) {
                if (calendarQueue.isEmpty() && i < startDay) {
                    week.addDay(new WeekDay(weekDays[i], ""));  
                } else if (currentDate <= numOfDays) {
                    week.addDay(new WeekDay(weekDays[i], String.valueOf(currentDate++)));
                } else {
                    week.addDay(new WeekDay(weekDays[i], ""));  
                }
            }
            calendarQueue.enqueue(week);
        }
		
		System.out.println("\n  " + months[month - 1] + " " + year);
        for (String day : weekDays) {
            System.out.print(day + " ");
        }
        System.out.println();

        while (!calendarQueue.isEmpty()) {
            Week week = calendarQueue.dequeue();
            week.display();
        }

	}


}
