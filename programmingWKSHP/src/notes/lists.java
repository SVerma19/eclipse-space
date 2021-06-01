package notes;

import java.util.ArrayList;
import java.util.List;

public class lists {
	
	private List<String> partyList;
	
	public lists() {
		partyList = new ArrayList<String>();
	}
	
	public void addToList(String stuff) {
		partyList.add(stuff);
	}
	
	public void getItemFromList(int index) {
		System.out.println("element " + index + " in our list is " + partyList.get(index));
	}
	
	public void removeItemFromList(int index) {
		System.out.println("element " + index + " removed from our list is " + partyList.remove(index));
	}
	
	public void simpleArrayList() {
		partyList.add("Solo Cups");
		partyList.add("Balloons");
		partyList.add("Soda");
		partyList.add("Pretzels");
		partyList.add("Clown");
		partyList.add("Pony");
		partyList.add("Board Game");
		
		System.out.println("element 2: " + partyList.get(2));
		System.out.println("ted drank all the soda. remove: " + partyList.remove(2));
		System.out.println("new element 2: " + partyList.get(2));
	}
	
	public void getListSize() {
		int listSize = partyList.size();
		
		if (listSize < 3) {
			System.out.println("little list");
		} else {
			System.out.println("big list");
		}
		
		System.out.println("list size is... " + listSize + "\n");
	}
	
	
}
