package project;

public class DailyBeachJournal {

	String beachName;
	String beachActivity;
	int suntanIndex;
	
	public void Report() {
		System.out.println(beachName);
	}
	
	public String getBeachName() {
		return beachName;
	}
	
	public void setBeachName(String name) {
		this.beachName = name;
	}
	
	public String getBeachActivity() {
		return beachActivity;
	}
	
	public void setBeachActivity(String activity) {
		this.beachActivity = activity;
	}

	public int getIndex() {
		return suntanIndex;
	}
	
	public void setIndex(int index) {
		this.suntanIndex = index;
	}

}
