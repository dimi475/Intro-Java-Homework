import java.util.*;
public class countsOfBitOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		int calc=0;
		while(num>0){
			int bit=num&1;
			if (bit==1){
				calc++;
			}
			num>>=1;			
		}
		System.out.println(calc);
	}

}
