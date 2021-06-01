package notes;

public class listTestHarness {
	
	public static void main(String[] args) {
		
		lists partyList = new lists();
		
		partyList.simpleArrayList();
		System.out.println(" ");
		
		partyList.addToList("Candy");
		partyList.addToList("Popcorn");
		partyList.addToList("Cracker Jacks");
		System.out.println(" ");
		
		partyList.removeItemFromList(4);
		partyList.removeItemFromList(6);
		partyList.getItemFromList(1);
		System.out.println(" ");
		
		partyList.getListSize();
		System.out.println(" ");
		
	}

}
