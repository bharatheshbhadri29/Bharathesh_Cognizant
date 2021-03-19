import java.util.Arrays;
import java.util.Scanner;

/**
 * Check for positive string.
 * @author BHARATHESH
 *
 */
public class PostiveString {
	
      
   
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		if (isAlphabaticOrder(s))  
	           System.out.println("Positive String");  
	        else
	            System.out.println("Negative String");
	}
	public static boolean isAlphabaticOrder(String s)  
    {  
       
        int n = s.length();  
        
        char c[] = new char [n];       
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        }  
       
        Arrays.sort(c);  
        
     
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  

}
