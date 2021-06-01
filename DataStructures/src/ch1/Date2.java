package ch1;

import java.time.LocalDate;
// LocalDate is an immutable date-time object that represents a date, often viewed as year-month-day
import java.time.temporal.ChronoUnit;
// ChronoUnit is a standard set of date periods units. 
// This set of units provide unit-based access to manipulate a date, time or date-time.
// The standard set of units can be extended by implementing TemporalUnit.

public class Date2 {
   
	public static void main(String[] args) {
		
		String date1 = "2000-01-01";
		String date2 = "2100-01-01";
		
		// Parsing the date
		LocalDate firstDate = LocalDate.parse(date1);
		LocalDate secondDate = LocalDate.parse(date2);
		
		// Calculating number of days in between
		int daysBetween = (int) ChronoUnit.DAYS.between(firstDate, secondDate);
	
		// Displaying the number of days
		System.out.println("The number of days between the two dates is: " + daysBetween);
		
	}    
}
