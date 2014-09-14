import java.util.*;

public class poinstInsideTheFigure {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT); 
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		if((x>22.5)||(x<12.5)||(y<13.5)||(y>6.0)){
			System.out.println("Outside");
		}
		else{
			if ((x>17.5)&&(x<20.0)&&(y>8.5)&&(y<13.5)){
				System.out.println("Outside");
			}
			System.out.println("Inside");
		}
		
	}

}
