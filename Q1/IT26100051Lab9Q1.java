import java.util.Scanner;

public class IT26100051Lab9Q1{
	public static void main(String []args){
		
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter value a : ");
		int a = input.nextInt();
		System.out.print("Enter value b : ");
		int b = input.nextInt();
		System.out.print("Enter value c : ");
		int c = input.nextInt();
		
		quadCalc(a,b,c);
	}
	
	public static void quadCalc(int a,int b,int c){
		double discriminant = Math.pow(b,2)-(4*a*c);
		
		double root1 =( (-b)+(Math.sqrt(discriminant)))/(2*a);
		double root2 =( (-b)-(Math.sqrt(discriminant)))/(2*a);
		
		if (discriminant>0){
			System.out.println("\nRoots are real and different : ");
		} else if (discriminant==0){
			System.out.println("\nRoots are real and equal : ");
		} else {
			System.out.println("\nRoots are imaginery : ");
		}
		
		System.out.println("Root 1 : "+ root1);
		System.out.println("Root 2 : "+ root2);
	}  
}