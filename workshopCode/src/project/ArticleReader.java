package project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleReader {

    private List<String> lines = new ArrayList<String>();

    public List<String> readMe(String fileName) {

        //mac format
        File file = new File("/Users/Sachin/eclipse-workspace/workshopCode/Articles/" + fileName);

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                lines.add(st);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //RETURNS Lines
        return lines;
    }

    //Returns size of longest word

    /*public List<String> getLines(){
        return lines;
    }*/


}
