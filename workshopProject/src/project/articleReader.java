package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class articleReader {

    /**
     * function which reads from a file & prints out the data line by line
     * TODO - (1) instead of or in addition to printing, capture the data
     * - (2) parametrize the method so it can process different files
     */

    List<String> lines = new ArrayList<String>();

    public List<String> readMe() {

        public ArrayList<String> readFile() {

            // file
            File file = new File("/Users/Sachin/eclipse-workspace/workshopProject/src/articles/articleOne.txt");

            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader(file));
                String st;
                while ((st = br.readLine()) != null) {
                    System.out.println(st);
                    lines.add(str);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lines;
        }
    }
}