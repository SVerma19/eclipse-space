package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ElementUniqueness {
	
    /****************** Brute Force ******************/ 
	public static boolean BruteForce(int[] array) {
		for(int i = 0; i < array.length; ++i) {
			for(int j = 0; j < array.length; ++j) {
				if(i != j && array[i] == array[j]) {
					return false;
				}
			}
		}
		return true;
	}

    /****************** Transform & Conquer ******************/ 
	public static boolean Transform(int[] array) {
		// Java uses QuickSort as its intrinsic .sort() method
		Arrays.sort(array, 0, array.length-1);

		for(int i = 1; i < array.length; ++i) {
			if(array[i] == array[i - 1]) {
				return false;
			}
		}
		return true;
	}
	

    public static void main(String[] args) {
        int[] array = new int[10000];
       
        Random random = new Random();
        
        for(int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt();
        }
        
        long start = System.nanoTime();
        BruteForce(array.clone());
        long end = System.nanoTime();
		long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		System.out.println("Brute Force spend in ms: " + timeInMillis);
		
		System.out.println(" ");
		
        long start2 = System.nanoTime();
        BruteForce(array.clone());
        long end2 = System.nanoTime();
        long timeInMillis2 = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Transform-And-Conquer time spend in ms: " + timeInMillis);  
    }    
}


/****************** WORKS CITED ******************
Code is based on the algorithm examples in the textbook —
Introduction to Design and Analysis of Algorithms, A. Levitin, 3rd Edition, Pearson
**************************************************/

