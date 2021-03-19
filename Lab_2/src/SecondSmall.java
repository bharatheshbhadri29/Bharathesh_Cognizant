/**
*Name : L BHARATHESH
*Description : Compilation and Running A Java program to find Second Smallest number of a given array.
*Date : 19/03/2021
 */

import java.util.*;

public class SecondSmall {
	
	public static int getSecondSmallest(int arr[]) {
		
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		
		System.out.println("Enter Length of Array : ");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		
		int []arr = new int[length];
		
		System.out.println("Enter the Array of length " + length + " : ");
		for (int i = 0; i < length; i++) {
			arr[i] = s.nextInt();
		}
		
		int secondSmallest = getSecondSmallest(arr);
		System.out.println("The Second Smallest number of a given Array is : " + secondSmallest);
	}

}
