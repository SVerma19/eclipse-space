package project;

public class TestHarness {

	public static void main(String[] args) {
		
		BeachReport br = new BeachReport();
		
		br.addBeach("Bondhi Beach");
		br.addBeach("Navagio");
		br.addBeach("Champagne Beach");
		br.addBeach("Ora Beach");
		br.addBeach("Marley Beach");
		br.addBeach("Nissi Beach");
		br.addBeach("Citara");
		br.getBeachCount();
		System.out.println(" ");
		
		br.removeBeach("Marley Beach");
		br.showAllBeaches();
		System.out.println(" ");
		
		br.whileBeach();
		System.out.println(" ");
		
		br.createJournal("Daytona Beach", "Swam", 12);
		br.createJournal("Palm Beach", "Built sand castles", 6);
		br.createJournal("Long Beach", "Played football", 8);
		
		br.numberOfBeaches();
		System.out.println(" ");
		br.showJournal("Citara");
		System.out.println(" ");
		br.showAll();
		System.out.println(" ");
		
		br.removeJournal("Palm Beach");
		System.out.println(" ");
		br.showAll();
	}
}
	
