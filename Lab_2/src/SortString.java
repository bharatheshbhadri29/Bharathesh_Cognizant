/**
*Name : L BHARATHESH
*Description : Compilation and Running A program to get the sorted list of Products name.
*Date : 18/03/2021
*/

import java.util.*;

public class SortString {

	public static void main(String[] args) {
		
		String[] arr = {"Rahul","Prasanth","Jaswanth","Girish","Bhadri"};
		        
		arr = sortString(arr);
				
		for(String i : arr) {
			System.out.println(i);
		}
	}

	private static String[] sortString(String[] arr) {
				
		Arrays.sort(arr);
		return arr;
	}
}