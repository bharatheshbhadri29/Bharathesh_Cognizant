import java.util.StringTokenizer;
import java.util.*;

/**
 * Sum of integers using Stringtokenizer.
 * @author BHARATHESH
 *
 */

public class SumofIntegers {
	
    public static void main(String args[]) {
    	
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one doller after each number : ");
        String s = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
    }
}