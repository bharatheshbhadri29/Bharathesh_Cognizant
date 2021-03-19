/**
*Name : L BHARATHESH
*Description : Compilation and Running A program to get the sorted list of Products name.
*Date : 18/03/2021
 */

import java.util.*;

public class SortedList {

	public static void main(String[] args) {
		
		String[] arr = {"Rahul","Prasanth","Jaswanth","Girish","Bhadri"};
        
		Arrays.sort(arr);
		for(String i : arr) {
			System.out.println(i);
		}
	}

}
