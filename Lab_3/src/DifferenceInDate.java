import java.time.*; 
import java.util.*; 
	
/**
 * This Class DifferenceInDate give the time gap between a date to present
 * @author BHARATHESH
 *
 * Date : 19/03/2021
 */

public class DifferenceInDate {
 
		static void findDifference(LocalDate start_date, LocalDate now) 
		{ 

			/**
			 *  find the period between the start and end date 
			 */
			Period diff = Period.between(start_date, now); 

			System.out.print( "Difference between two dates is : "); 

			System.out.println(diff.getYears() + " Years, " + diff.getMonths() + " Months " + diff.getDays() + " Days"); 
		} 

		public static void main(String[] args) 
		{ 
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Year");
			int yyyy = s.nextInt();
			System.out.println("Enter the Month");
			int mm = s.nextInt();
			System.out.println("Enter the Date");
			int dd = s.nextInt();
			
			/**
			 *  Start date 
			 */
			LocalDate start_date = LocalDate.of(yyyy, mm, dd); 

			/**
			 * Present date 
			 */
			LocalDate now 
				= LocalDate.now(); 

			findDifference(start_date, now); 
		} 
	} 
