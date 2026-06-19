import java.util.Scanner;

public class IT26100051Lab9Q1{
	public static void main(String []args){
		
		Scanner input  = new Scanner(System.in);
		
		String[] name = new String[5];
		double[] finalMark = new double[5];
		String[] grade = new String[5];
		
		 for (int count=0; count<5; count++){
		System.out.print("\nEnter Name of Student "+(count+1)+" : ");
		name[count] = input.next();
		
		
		System.out.print("Enter Assignment Mark (out of 100) for "+ name[count]+" : ");
		double assignMark = input.nextDouble();
		
		System.out.print("Enter  Exam   Mark    (out of 100) for "+ name[count]+" : ");
		double examPaper = input.nextDouble();
		
		finalMark[count]= calcFinalMark(assignMark,examPaper);
	   
	}
		printDetails(name,finalMark,grade);
	
	}
	
	public static double calcFinalMark(double assignMark,double examPaper){
		double finalMark = (0.3*assignMark)+ (0.7*examPaper);
		return finalMark;
	}
	
	

    public static void printDetails(String[] name,double[] finalMark,String[] grade ){
		System.out.println("\nName\t\tFinal Mark\t\tGrade");
		
	     for (int count=0; count<5; count++){
			 if (finalMark[count] >= 75.0){
				grade[count] = "A" ;
			 } else if (finalMark[count] >= 65.0){
				 grade[count] = "B";
			 } else if (finalMark[count] >= 55.0){
				 grade[count] = "C";
			 } else if (finalMark[count] >= 35.0){
				 grade[count]= "S";
			 } else{
				 grade[count] = "F";
			 }
		System.out.println(name[count]+"\t\t"+finalMark[count]+"\t\t\t"+grade[count]);
		
		}
	}
	
	
}