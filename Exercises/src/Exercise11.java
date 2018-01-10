/* Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data: Radius = 7.5 
 */
//Area of a circle = Pie * r*r

import java.math.*;
public class Exercise11 {

	public static void main(String[] args) {
		
		double r = 7.5;
		
		double Areaofcircle = Math.PI*r*r;
		double perimeter = 2*Math.PI*r;
		
		System.out.println("Radius of circle " + Areaofcircle);
		System.out.println("Perimter of circle " + perimeter);
	
	}

}
