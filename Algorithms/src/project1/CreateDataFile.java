package project1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class CreateDataFile {

	public static void main(String[] args) throws IOException {
		
		DataToFile(300000, "/Users/Sachin/eclipse-workspace/Algorithms/src/project1/ThreeHundredThousand.txt");
	
	}
	
	
	public static void DataToFile(int num, String fileName) throws IOException {
	    FileWriter fileWriter = new FileWriter(fileName);
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	    Random rand = new Random();
	    
	    int[] arr = new int[num];
	   
	    for (int i = 0; i < num; i++) {
	    		arr[i] = rand.nextInt(5000000);
	    		printWriter.println(arr[i]);
	    }
	    
	    if (printWriter != null) {
	        printWriter.flush();
	        printWriter.close();
	    }
        
	    System.out.println("Done");
	}

}

