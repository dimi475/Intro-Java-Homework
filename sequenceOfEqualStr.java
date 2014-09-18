
import java.util.*;


/**Write a program, that enters an array of strings and finds in it all sequences
 * of equal elements. The input strings are given as a single line, separated by a space. 
 * @author SoftUni
 */
public class sequenceOfEqualStr {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String inputstr=input.nextLine();
		String[] symbs=inputstr.split("\\s");
		Arrays.sort(symbs);
		for (String symb:symbs){
			System.out.println(symb);
		}
				
	}

}
