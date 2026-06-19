import java.util.Scanner;

public class IT26100051Lab9Q1{
	public static void main(String []args){
		
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
	    double radius = input.nextInt();
		
		System.out.print("The area of the circle with radius "+ radius+ " is : " + circleArea(radius));
		
		
	}
	
	public static double circleArea(double radius){
		double area = Math.PI*radius*radius;
		return area;
	}
	
	
}