package exam1;

public class TestHarness {
	
	public static void main(String[] args) {
		
		Repo repo = new Repo();
		
		repo.createSourceFile("file 1", 20, ".java");
		repo.createSourceFile("file 2", 25, ".py");
		repo.createSourceFile("file 3", 30, ".c++");
		repo.createSourceFile("file 4", 35, ".py");
		repo.createSourceFile("file 5", 40, ".html");
		
		// not printing correctly
		repo.displayAll();
		System.out.println("***********************");
		System.out.println(" ");
		
		
		// HISTORY
		
		
		repo.removeFile("file 3");
		repo.displayAll();
		System.out.println("***********************");
		System.out.println(" ");
		
		
		// OTHER REMOVE
		
		
		repo.retrieveSingle("file 5");
		System.out.println("***********************");
		System.out.println(" ");
		// + HISTORY
		
		
		/*
		repo.retrieveMultiple(".py");
		System.out.println("***********************");
		System.out.println(" ");
		// + HISTORY
		 */
		
		
		repo.retrieveNames();
		System.out.println("***********************");
		System.out.println(" ");
		
		
		// HISTORY
		
		
		// RANDOM SOURCE FILE
	}

}

