
/*Write a Java program to print the sum (addition), multiply, subtract, 
divide and remainder of two numbers*/
import java.util.*;
public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int  firstnumber;
		int  secondnumber;
		int sum;
		int multiply;
		int divide;
		int reminder;
		
		
		System.out.println("Enter First Number");
		firstnumber = input.nextInt();
		
		System.out.println("Enter Second Number");
		secondnumber = input.nextInt();
		
		sum = firstnumber+secondnumber;
		System.out.println("sum of above two numbers is " + (sum));
		
		multiply = firstnumber*secondnumber;
		System.out.println("Multiply of above two numbers is " + (multiply));
		
		divide = firstnumber/secondnumber;
		System.out.println("divide of above two numbers is " + (divide));
		
		reminder = firstnumber%secondnumber;
		System.out.println("reminder of above two numbers is " + (reminder));
		
		input.close();
	}

}
