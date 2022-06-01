package chapter12;
import java.lang.reflect.Array;
import java.util.Scanner;
/**
 * 
 * @author ethan hunt
 * @date 5/25/22
 */
public class Exercise12_3 {
	
	public class OutOfBoundsException{
		
		public static boolean counter(int count) {
			if(count > 99) {
				return false;
			}else {
				return true;
			}
		}
	}
	public static void main(String[] args) {
		int count = 0;
		int userPick = 0;
		int[] intArray = new int[100];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 100; i++) {
			int rando = (int)(Math.random()*9);
			intArray [i] = rando;
			count++;
			//System.out.println(intArray[i]);
			
		}
		System.out.println("please enter a number between 0-99 to check the value");
			userPick = input.nextInt();
			OutOfBoundsException.counter(userPick);
			if(OutOfBoundsException.counter(userPick) == true) {
				System.out.println("the equivalent value for \""+ userPick+ "\" in the array is "+ intArray[userPick]);
			} else if(OutOfBoundsException.counter(userPick) == false) {
				while(OutOfBoundsException.counter(userPick) == false) {
					System.out.println("Your selection was \"Out of bounds\", please enter another value");
					userPick = input.nextInt();
				}
				
				System.out.println("the equivalent value for \""+ userPick+ "\" in the array is "+ intArray[userPick]);
			}
		
	}

}
