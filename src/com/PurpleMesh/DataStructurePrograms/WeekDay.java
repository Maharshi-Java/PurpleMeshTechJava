package com.PurpleMesh.DataStructurePrograms;

public class WeekDay {
	
	
	String day;
    String date;

    public WeekDay(String day, String date) {
        this.day = day;
        this.date = date;
    }

    @Override
    public String toString() {
        return date.isEmpty() ? "   " : String.format("%2s ", date);
    }
}
