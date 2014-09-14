import java.util.*;

public class decToHex {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int deci=input.nextInt();
		String hexy=Integer.toHexString(deci).toUpperCase();
		System.out.println(hexy);
	}

}
