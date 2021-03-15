/**
*Name : L BHARATHESH
*Description : Compilation and Running Traffic Lights
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
		int choice = n.nextInt();
		String comm = null;
		switch (choice) {
		case 1 :
			comm = "Stop";
			break;
		case 2 :
			comm = "Ready";
			break;
		case 3 :
			comm = "Go";
			break;
		}
		System.out.println(comm);
	}

}
