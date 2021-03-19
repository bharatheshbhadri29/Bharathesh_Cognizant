/**
*Name : L BHARATHESH
*Description : Compilation and Running A Java program to test if an array contains a specific value.
*Date : 18/03/2021
 */

public class ContainsValue {

	public static void main(String[] args) {

		int []arr = {2,4,5,6,8,3,7,21,45};
		int keyValue = 1;
		int check = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == keyValue) {
				check = 1;
			}
		}
		if (check == 1) {
			System.out.println("Yes, Array Contains a Specific Value");
		}
		else {
			System.out.println("No, Array Contains does not a Specific Value");
		}
	}
}
