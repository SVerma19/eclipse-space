package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeachReport {

	private List<String> beachList;
	private Iterator<String> iterator;
	private List<DailyBeachJournal> dailyBeachJournal;
	private Iterator<DailyBeachJournal> journalIterator;

	public BeachReport() {
		beachList = new ArrayList<String>();
		dailyBeachJournal = new ArrayList<DailyBeachJournal>();
	}
	
	public void addBeach(String newBeach) {
		beachList.add(newBeach);
	}
	
	public void removeBeach(String oldBeach) {
		beachList.remove(oldBeach);
	}
	
	public void findBeach(String beach) {
		// started using iterator, but used (contains) list method instead
		iterator = beachList.iterator();
			
		while (iterator.hasNext()) {
			// String currentElement = iterator.next();
				if (beachList.contains(beach)) {
					System.out.println(beach);
				} else {
					System.out.println("beach is not in the list");
				}
			}
		}
	
	public void showAllBeaches() {
		System.out.println(beachList);
	}
	
	public void getBeachCount() {
		System.out.println("there are " + beachList.size() + " beaches");
	}
	
	public void validateBeach(String beach) {
		// started using iterator, but used (contains) list method instead
		iterator = beachList.iterator();
			
		while (iterator.hasNext()) {
			// String currentElement = iterator.next();
				if (beachList.contains(beach)) {
					System.out.println(beach + " is in the list");
				} else {
					System.out.println(beach + " is not in the list");
				}
			}
		}
	
	public void whileBeach() {
		iterator = beachList.iterator(); 
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\n"); 
		}	
	}
	
	public void createJournal(String beachName, String beachActivity, int suntanIndex) {
		DailyBeachJournal beachJournal = new DailyBeachJournal();
		
		beachJournal.setBeachName(beachName);
		beachJournal.setBeachActivity(beachActivity);
		beachJournal.setIndex(suntanIndex);
		
		dailyBeachJournal.add(beachJournal);	
	}	

	public void removeJournal(String deleteEntry) {
		while (journalIterator.hasNext()) {
			DailyBeachJournal journal = journalIterator.next();
			if (journal.getBeachName().equals(deleteEntry)) {
				dailyBeachJournal.remove(deleteEntry);
				System.out.println("removed: " + deleteEntry);
				break;
			}
		}
	}
	
	public void showJournal(String entry) {
		while (journalIterator.hasNext()) {
			DailyBeachJournal journal = journalIterator.next();
			if (journal.getBeachName().equals(entry)) {
				System.out.println(journal);
			} else {
				System.out.println("journal is not in the list");
			}
		}
	}
	
	public void showAll() {
		while (journalIterator.hasNext()) {
		DailyBeachJournal journal = journalIterator.next();
			System.out.println(journal);
		}
	}
	
	public void numberOfBeaches() {
	// prints number of beach journals because every beach journal will have one beach
		System.out.println("the number of beachs in the beach journals are: " + dailyBeachJournal.size());
	}
}



























