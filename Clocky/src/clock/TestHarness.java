package clock;

public class TestHarness {
	
	public static void main(String[] args) {
		
		Clock clock = new Clock("5:00 AM");
		
		clock.addAlarmTime("7:30 AM");
		clock.addAlarmTime("10:00 AM");
		clock.addAlarmTime("12:00 AM");
		clock.addAlarmTime("2:00 PM");
		clock.showAlarmTimes();
		System.out.println(" ");
		
		clock.removeAlarmTime("5:00 AM");
		clock.removeAlarmTime("2:00 PM");
		System.out.println(" ");
		clock.showAlarmTimes();
	}

}
