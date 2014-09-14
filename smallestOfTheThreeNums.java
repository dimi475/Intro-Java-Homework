import java.util.Scanner;
import java.util.Arrays;

public class smallestOfTheThreeNums {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] nums=new int[3];
		for (int i=0;i<nums.length;i++){
			nums[i]=input.nextInt();	
		}
		Arrays.sort(nums);
		System.out.println(nums[0]);
	}

}
