package clock;

import java.util.ArrayList;
import java.util.List;

public class ClockAlarm {
	
	private List<String> alarmTimes;

	public ClockAlarm() {
		alarmTimes = new ArrayList<String>();
	}
	
	// accessor
	public List<String> getAlarms() {
		return alarmTimes; 
	}
	
	// method to add alarm time
	public void addAlarmTime(String alarmTime) {
		alarmTimes.add(alarmTime);
	}
	
	// method to delete alarm time
	public void deleteAlarmTime(String deleteAlarm) {
		// can also create a method to validate alarm that the alarm time exists
		if (alarmTimes.contains(deleteAlarm)) {
			alarmTimes.remove(deleteAlarm);
			System.out.println(" ");
			System.out.println("alarm time " + deleteAlarm + " removed");
		} else {
			System.out.println(" ");
			System.out.println("cannot remove alarm, alarm does not exist");
		}
	}
	
	// method to print the alarm times in the list
	public void displayAlarmTimes() {
		System.out.print(alarmTimes);
	}
	
	
}

