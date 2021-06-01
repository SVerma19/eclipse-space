package ch4;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Payroll {
	
	private int[] itemsSold;
	private double[] Wages;
	private int payPerItem;
	double employeeWage;

	
	public double computeWages(double fixedWage, double perItemWage) {
		double additionalAmount;
		
		additionalAmount = (itemsSold.length*perItemWage);
		employeeWage = fixedWage + additionalAmount;
		
		// Wages.add(employeeWage);
		
		return employeeWage;
	}

/*
	public double computeBonusThreshold(int n) {
		int a[] = Wages.sort(); 
  
        // Calculating median
        if (n % 2 != 0) { 
        	return (double)a[n / 2]; 
        	return (double)a[(n - 1) / 2] + a[n / 2] / 2.0; 
        }
	}
*/

}
