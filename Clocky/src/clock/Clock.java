package clock;

public class Clock {

	private ClockAlarm clockAlarm;
	private String currentTime;
	
	
	public Clock(String currentTime) {
		clockAlarm = new ClockAlarm();
		this.currentTime = currentTime;
	}
	
	public Clock(String currentTime, String alarmTime) {
		clockAlarm = new ClockAlarm();
		this.currentTime = currentTime;
		addAlarmTime(alarmTime);
	}
	
	// mutator
	public void setAlarm(ClockAlarm alarmTime) {
		this.clockAlarm = alarmTime;
	}
	
	public void addAlarmTime(String alarmTime) {
		clockAlarm.addAlarmTime(alarmTime);
	}
	
	public void removeAlarmTime(String alarmTime) {
		clockAlarm.deleteAlarmTime(alarmTime);
	}
	
	public void showAlarmTimes() {
		clockAlarm.displayAlarmTimes();
	}

}
