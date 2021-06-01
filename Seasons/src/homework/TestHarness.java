package homework;

public class TestHarness {

	public static void main(String[] args) {
		Seasons(SeasonalActivities.Seasons.SPRING);
		Seasons(SeasonalActivities.Seasons.SUMMER);
		Seasons(SeasonalActivities.Seasons.AUTUMN);
		Seasons(SeasonalActivities.Seasons.WINTER);
	}

	
	public static void Seasons(SeasonalActivities.Seasons activity){
	
		SeasonalActivities theSeasons = new SeasonalActivitiesIml();
		
		switch(activity) {
			case SPRING:
				System.out.println("S P R I N G");
				System.out.println("———————————");
				theSeasons.HuntEasterEggs();
				System.out.println(" ");
				break;
			case SUMMER:
				System.out.println("S U M M E R");
				System.out.println("———————————");
				theSeasons.GoSunbathing();
				System.out.println(" ");
				break;
			case AUTUMN:
				System.out.println("A U T U M N");
				System.out.println("———————————");
				theSeasons.ApplePicking();
				System.out.println(" ");
				break;
			case WINTER:
				System.out.println("W I N T E R");
				System.out.println("———————————");
				theSeasons.SkiingInSnow();
				System.out.println(" ");
				break;
			default:
				break;
		}
	}
	
/*
	public static void menu() {

	}
*/
	
}

