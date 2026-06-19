import java.util.Scanner;

public class IT26100051Lab9Q3{
	public static void main(String []args){
		System.out.println("Result of (3 * 4 + 5*7)²       : "+ (square(add((multiply(3,4)),(multiply(5,7))))));
		
		System.out.print("Result of (4 + 7)² + (8 + 3)²  :  "+(add(square(add(4,7)),square(add(8,3)))) );
	}
	
	public static double add(double num1, double num2){
		return num1+num2;
	}
	
	public static double multiply(double num1,double num2){
		return num1*num2;
	}
	
	public static double square(double num1){
		return Math.pow(num1,2);
	}
	
}