package com.PurpleMesh.DataStructurePrograms;

public class Week {
	
	private GenericQueue<WeekDay> weekDays;
	
	public Week() {
        weekDays = new GenericQueue<>();
    }
	
	public void addDay(WeekDay day) {
        weekDays.enqueue(day);
    }
	public void display() {
        int count = weekDays.size();
        for (int i = 0; i < count; i++) {
            WeekDay wd = weekDays.dequeue();
            System.out.print(wd + " ");
            weekDays.enqueue(wd); 
        }
        System.out.println();
    }
	
}
