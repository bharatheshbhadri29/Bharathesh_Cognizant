/**
*Name : L BHARATHESH
*Description : Compilation and Running Sum of Cube of Digits of an n Digit Number
*Date : 14/03/2021
 */

import java.util.Scanner;

public class Traffic_Lights {

	public static void main(String[] args) {
		System.out.println("1 : RED");
		System.out.println("2 : YELLOW");
		System.out.println("3 : GREEN");
		
		System.out.println("Enter Your Choice: ");
		Scanner n = new Scanner(System.in);
		int Choice = n.nextInt();
		String Comm = null;
		switch (Choice) {
		case 1 :
			Comm = "Stop";
			break;
		case 2 :
			Comm = "Ready";
			break;
		case 3 :
			Comm = "Go";
			break;
		}
		System.out.println(Comm);
	}

}
