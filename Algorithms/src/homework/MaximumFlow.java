package homework;

public class MaximumFlow {

	    static int findSource(int[][] A) {
	        int n = A.length;
	        for (int i = 0; i < n; i++) {
	            int j = 0;
	            while (j < n) {
	                if (A[i][j] < 0) break;
	                j++;
	            }
	            if (j == n) return i;
	        }
	        return -1;
	    }
	    
	    static int findSink(int[][] A) {
	        int n = A.length;
	        for (int i = 0; i < n; i++) {
	            int j = 0;
	            while (j < n) {
	                if (A[i][j] > 0) break;
	                j++;
	            }
	            if (j == n) return i;
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args) {
			int graph[][] = new int[][] { 
				   						{0, 2, 0, 3, 0, 0}, 
				   						{0, 0, 5, 0, 3, 0}, 
				   						{0, 0, 0, 0, 0, 2}, 
				   						{0, 0, 1, 0, 0, 0}, 
				   						{0, 0, 0, 0, 0, 4}, 
				   						{0, 0, 0, 0, 0, 0} 
                						}; 
                						
            // +1 because the source starts at 1 and not 0
	    	System.out.println("Source: "+ (findSource(graph) + 1));
	    	System.out.println("Sink: "+ (findSink(graph) + 1));
	    }
	
	}


/****************** WORKS CITED ******************
Code is based on the algorithm examples in the textbook —
Introduction to Design and Analysis of Algorithms, A. Levitin, 3rd Edition, Pearson
**************************************************/
