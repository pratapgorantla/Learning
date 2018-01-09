import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		
		  // creates a scanner to obtain input from a command window
		Scanner input = new Scanner(System.in);
		
		int firstvalue;
		int secondvalue;
		int product;
		
		System.out.println("Enter First Number");
		firstvalue = input.nextInt();
		
		System.out.println("Enter Second Number");
		secondvalue = input.nextInt();
		
		product = firstvalue*secondvalue;
		System.out.println("Product of two numbers is " + product);
		
	}

}