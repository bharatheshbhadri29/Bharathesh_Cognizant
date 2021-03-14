/**
*Name : L BHARATHESH
*Description : Compilation and Running Sum of Cube of Digits of an n Digit Number
*Date : 14/03/2021
 */

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i =0 , num =0;
		
	    String primeNumbers = "";
	    
	    System.out.println("Enter the value of n:");
	    
	    int n = s.nextInt();
	    for (i = 1 ; i <= n ; i++)  	   
	    { 		 		  
	    	int counter = 0; 		  
	        for(num = i ; num >= 1 ; num--) {
	        	if(i % num == 0) {
	        		counter = counter + 1;
	        	}
	        }
	        if (counter ==2) {
	        	primeNumbers = primeNumbers + i + " ";
	        }	
	     	}	
	    	System.out.println("Prime numbers from 1 to n are :" + primeNumbers);
	}  
}
