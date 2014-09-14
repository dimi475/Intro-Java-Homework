import java.util.Scanner;

public class triangleArea {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int XOne=input.nextInt();
		int YOne=input.nextInt();
		int XTwo=input.nextInt();
		int YTwo=input.nextInt();
		int XThree=input.nextInt();
		int YThree=input.nextInt();
		int area=(XOne*(YTwo-YThree)+XTwo*(YThree-YOne)+XThree*(YOne-YTwo))/2;
		if (area>0){
			System.out.printf("area is : %d", area);
		}
		else{
			System.out.println("0");
		}
	}

}
