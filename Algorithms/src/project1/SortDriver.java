package project1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SortDriver {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		/****************** ALLOW USER TO CHOOSE FILE SIZE ******************/
		String fiveThousand = "/Users/Sachin/eclipse-workspace/Algorithms/src/project1/FiveThousand.txt";
		String twentyFiveThousand = "/Users/Sachin/eclipse-workspace/Algorithms/src/project1/TwentyFiveThousand.txt";
		String eightyThousand = "/Users/Sachin/eclipse-workspace/Algorithms/src/project1/EightyThousand.txt";
		String oneHundredFiftyThousand = "/Users/Sachin/eclipse-workspace/Algorithms/src/project1/OneHundredFiftyThousand.txt";
		String threeHundredThousand = "/Users/Sachin/eclipse-workspace/Algorithms/src/project1/ThreeHundredThousand.txt";
		
	    System.out.println("Enter the size of the data set you would like to use.");	
		System.out.println("5000, 25000, 80000, 150000, 300000");
	    
	    Scanner fileSize = new Scanner(System.in);
        int fileNum = fileSize.nextInt();
       
        int[] arr = null;
        
        if (fileNum == 5000) {
        	arr = FileToArray(fiveThousand, 5000);
        }
        else if (fileNum == 25000) {
        	arr = FileToArray(twentyFiveThousand, 25000);
        }
        else if (fileNum == 80000) {
        	arr = FileToArray(eightyThousand, 80000);
        }
        else if (fileNum == 150000) {
        	arr = FileToArray(oneHundredFiftyThousand, 150000);
        }
        else if (fileNum == 300000) {
        	arr = FileToArray(threeHundredThousand, 300000);
        } else {
        	System.out.println("Not a valid file size.");
        }
        
        System.out.println(" ");	
        
        
    	/****************** ALLOW USER TO CHOOSE METHOD OF SORTING + CACLC TIME + RUN + PRINT ******************/
        System.out.println("Enter the sorting algorithm you would like to use.");	
		System.out.println("Bubble, Insertion, Merge, Quick, Selection");
	    
		Scanner sortSC = new Scanner(System.in); 
        String sortMethod = sortSC.nextLine();
        
		if (sortMethod.toLowerCase().equals("bubble")) {
			long start = System.nanoTime();
			BubbleSort(arr);
			long end = System.nanoTime();
			long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		
			System.out.println("\n" + "Time spend in ms: " + timeInMillis);
			printData(arr);
		} 
		else if (sortMethod.toLowerCase().equals("insertion")) {
			long start = System.nanoTime();
			InsertionSort(arr);
			long end = System.nanoTime();
			long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		
			System.out.println("\n" + "Time spend in ms: " + timeInMillis);
			printData(arr);
		}
		else if (sortMethod.toLowerCase().equals("merge")) {
			long start = System.nanoTime();
			MergeSort(arr, 0, arr.length-1);
			long end = System.nanoTime();
			long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		
			System.out.println("\n" + "Time spend in ms: " + timeInMillis);
			printData(arr);
		}
		else if (sortMethod.toLowerCase().equals("quick")) {
			long start = System.nanoTime();
			QuickSort(arr, 0, arr.length-1);
			long end = System.nanoTime();
			long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
		
			System.out.println("\n" + "Time spend in ms: " + timeInMillis);
			printData(arr);
		} 
		else if (sortMethod.toLowerCase().equals("selection")) {
			long start = System.nanoTime();
			SelectionSort(arr);
			long end = System.nanoTime();
			long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);

			System.out.println("\n" + "Time spend in ms: " + timeInMillis);
			printData(arr);
        } else {
        	System.out.println("Not a valid sorting method.");
        }
		
    }


	/****************** READ INTEGERS IN FILE TO ARRAY ******************/
	private static int[] FileToArray(String file, int num) throws FileNotFoundException {	
		Scanner scanner = new Scanner(new File(file));
	
		int[] tall = new int[num];
		int i = 0;
		while (scanner.hasNextInt()) {
			tall[i++] = scanner.nextInt();
		}
		
		return tall;
	}

	
	/****************** BUBBLE SORT ******************/
	private static void BubbleSort(int[] arr) {
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) { 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
             } 
        }
	}
	
	
	/****************** INSERTION SORT ******************/
	private static void InsertionSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
	
	
	/****************** MERGE SORT ******************/
    private static void merge(int arr[], int l, int m, int r) { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 

        int i = 0, j = 0; 
   
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    private static void MergeSort(int arr[], int l, int r) { 
        if (l < r) { 
            int m = (l + r) / 2; 
  
            MergeSort(arr, l, m); 
            MergeSort(arr, m + 1, r); 
  
            merge(arr, l, m, r); 
        } 
        
    } 
    
    
    /****************** QUICK SORT ******************/ 
    private static int partition(int arr[], int low, int high) { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) { 
            if (arr[j] < pivot) { 
                i++; 
  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
    
    private static void QuickSort(int arr[], int low, int high) { 
        if (low < high) { 
            int pi = partition(arr, low, high); 
  
            QuickSort(arr, low, pi-1); 
            QuickSort(arr, pi+1, high); 
        } 
    } 

    
    /****************** SELECTION SORT ******************/
	private static void SelectionSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
	
	
    /****************** PRINT DATA ******************/
    private static void printData(int arr[]) { 
		System.out.println(" ");
	    System.out.println("Sorted Data Set");
	    System.out.println("————");
	    
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]); 
        }
    } 
   

}
