package Package;

import java.util.Scanner;

public class Q2StudentGrade {

	public static void main(String[] args) {
		
			System.out.println("Please enter your grade:");

			Scanner scanner = new Scanner(System.in);
			String gradestring = scanner.next();

			int grade=Integer.parseInt(gradestring);
			
			if (grade<=5 && grade>=0) {
				System.out.println("Elementary School");
			} 
						
			if (grade<=8 && grade>=6) {
		System.out.println("Middle School");
			} 
					
			if (grade<=12 && grade>=9) {
	System.out.println("High School");
		    } 
				
		}
	}
		