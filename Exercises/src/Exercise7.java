import java.util.Scanner;

/*Write a Java program that takes a number as input and prints its multiplication table upto 10 */

public class Exercise7 {
	public static void main(String[] args) {
		
		int number;
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		number = input.nextInt();
		
		for(i=1; i<11;  i++){
			int b = number*i;

			System.out.println("8x" + (i) + "=" +  b);
			
			
			
		}
		

	}

}
