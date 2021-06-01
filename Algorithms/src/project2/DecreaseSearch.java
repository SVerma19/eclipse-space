package project2;

public class DecreaseSearch {
	
	   static int decreaseSearch(String[] arr, String x) { 
	        int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	            int res = x.compareTo(arr[m]); 
	  
	            if (res == 0) 
	                return m; 
	  
	            if (res > 0) 
	                l = m + 1; 
	  
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
	    } 
	   
	   static int decreaseSearchCharacter(Character[] a, char key) {
		    int low = 0;
		    int high = a.length - 1;

		    while (low <= high) {
		        int mid = (low + high) >>> 1;
		        char midVal = a[mid];

		        if (midVal < key)
		            low = mid + 1;
		        else if (midVal > key)
		            high = mid - 1;
		        else
		            return mid; 
		    }
		    return -(low + 1); 
		}
    
}
