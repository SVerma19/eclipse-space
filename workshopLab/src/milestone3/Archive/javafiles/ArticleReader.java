package Milestone1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ArticleReader implements ReaderInterface{
	
       List<String> lines = new ArrayList<String>();
	
	
	public List<String> readFile(String fileName) {

		////path to where the TXT file is located
		File file = new File("/Users/guillem/Desktop/Fairfield/Fall 2019/CS231L/LabProjectMilestone2/"+ fileName);
		
		

	 	BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
				//System.out.println(st);
				lines.add(st);
			}
			
			
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		return lines;
	}



	
	
	
}






