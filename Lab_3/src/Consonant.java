import java.util.Scanner;

/**
 * This Class Consonant replaces Consonants with its next character. 
 * @author BHARATHESH
 *
 * Date : 19/03/2021
 */

public class Consonant {

	public static void main(String[] args) {
		System.out.println("Enter string:");
		Scanner s = new Scanner(System.in);
		String str = s.next(); 
        System.out.println(alterString(str.toCharArray()));
	}
	
	static boolean isVowel(char ch) 
    { 
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I'
                && ch != 'O' && ch != 'U')  { 
            return false; 
        } 
        return true; 
    } 
 
    static String alterString(char[] s)  { 

        for (int i = 0; i < s.length; i++) { 
            if (!isVowel(s[i])) { 
                if (s[i] == 'z')  { 
                    s[i] = 'a'; 
                }   
                else { 
                    s[i] = (char) (s[i] + 1); 
                    if (isVowel(s[i]))  { 
                        s[i] = (char) (s[i] + 1); 
                    } 
                } 
            } 
        } 
        return String.valueOf(s); 
    } 
}
