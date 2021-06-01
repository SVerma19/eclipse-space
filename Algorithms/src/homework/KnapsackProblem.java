package homework;

class KnapsackProblem { 

    private static int max(int a, int b) {  
      return (a > b) ? a : b;  
    } 

    private static int knapSack(int W, int wt[], int val[], int n) { 
        if (n == 0 || W == 0) {
            return 0; 
        }

        if (wt[n - 1] > W) {
            return knapSack(W, wt, val, n - 1);  
        } else {
            return max(val[n - 1] 
                       + knapSack(W - wt[n - 1], wt, 
                                  val, n - 1), 
                       knapSack(W, wt, val, n - 1)); 
        } 
    } 
  
    public static void main(String args[]) { 
        int val[] = new int[] {25, 20, 15, 40, 50}; 
        int wt[] = new int[] {3, 2, 1, 4, 5}; 
        int W = 6; 
        int n = val.length; 
        System.out.print("Maximum value: $");
        System.out.print(knapSack(W, wt, val, n)); 
    } 
    
} 

/****************** WORKS CITED ******************
Code is based on the algorithm example from GeeksforGeeks —
https://www.geeksforgeeks.org/
**************************************************/
