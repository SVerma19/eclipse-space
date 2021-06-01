package homework;

import java.util.*;

public class NegativeQuickSort {

	public static void partition(int[] a, int start, int end) {
                int pInd = start; 
                
                for (int i = start; i <= end; i++) {
                        if (a[i] < 0) {
                                swap(a, i, pInd);
                                pInd++;
                        }
                }
        }
	
        private static void swap(int[] a, int i, int j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
        }
        
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of array: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            
            System.out.println("Enter array elements one by one: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            System.out.println("Your array after partition: ");
                partition(a, 0, a.length - 1);
                System.out.println(Arrays.toString(a));
        }
}