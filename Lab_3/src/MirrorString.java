import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  The mirror image of a String
 * @author BHARATHESH
 *
 * Date : 19/03/2021
 */

public class MirrorString {

	public static void main(String args[])throws Exception {

		InputStreamReader r=new InputStreamReader(System.in);    
	    
		BufferedReader br=new BufferedReader(r);  
	    
		System.out.println("Enter the string to be mirrored");    
	    String word=br.readLine(); 
	    StringBuffer revWord = getImage(word);
	    
	    System.out.println(word+"|"+revWord);
	}

	private static StringBuffer getImage(String word) {
		
		StringBuffer revWord=new StringBuffer(word);
	    
	    revWord.reverse();
	    return revWord;
		
	}

}
