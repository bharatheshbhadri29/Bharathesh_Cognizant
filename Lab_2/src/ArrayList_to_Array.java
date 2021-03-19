/**
*Name : L BHARATHESH
*Description : Compilation and Running A Java program to convert an ArrayList to an array.
*Date : 18/03/2021
 */

import java.util.*;

public class ArrayList_to_Array {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>(); 
        arr.add(10); 
        arr.add(20); 
        arr.add(30); 
        arr.add(40); 
        arr.add(50);
        
		Object[] array = arr.toArray();
		for(Object obj : array) {
			System.out.print(obj + " ");
		}
	}
}