import java.util.*;

/**
 * @author SoftUni
 * Write a program to enter a number n and n integer numbers and sort and print them.
 * Keep the numbers in array of integers int[].
 */
public class sortArrayOfNums {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int[]nums=new int[num];
		for (int i=0;i<num;i++){
			nums[i]=input.nextInt();
		}
		Arrays.sort(nums);
		for (int j=0;j<nums.length;j++){
			System.out.println(nums[j]);
		}
	}
}
