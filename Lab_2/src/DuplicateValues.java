/**
*Name : L BHARATHESH
*Description : Compilation and Running A program to get the list of products with duplicate values.
*Date : 18/03/2021
 */

public class DuplicateValues {

	public static void main(String[] args) {

		int []arr = {2,4,5,2,6,8,8,4};
		
		System.out.println("List of Duplicate Values is : ");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] == arr[i]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}