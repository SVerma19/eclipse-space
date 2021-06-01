package ch3;

public class Recursion {
	
	public static int factorial(int n) {
		int retValue = 1;
		
		while (n != 0) {
			retValue = retValue * n;
			n = n - 1;
		}
		return (retValue);
	}
	
}
