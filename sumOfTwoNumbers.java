import java.util.Scanner;


public class sumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner inputOne=new Scanner(System.in);
		int numOne=inputOne.nextInt();
		Scanner inputTwo=new Scanner(System.in);
		int numTwo=inputTwo.nextInt();
		int result=numOne+numTwo;
		System.out.println(result);
	}

}
