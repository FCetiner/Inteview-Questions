package interviewQuestions;

import java.util.Scanner;

public class Q17_ReverseHalfPyramid {

	public static void main(String[] args) {
		/*
		  Ask user to enter the number of lines of a inverted half pyramid .
		  Type a program to create the inverted half pyramid.
		  For example if the number of lines is 5, the pyramid will be like;

		  * * * * *
		  * * * *
		  * * *
		  * *
		  *
*/
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter a num");
		  int num=scan.nextInt();
		
		  
		  for (int i = 0; i <= num; i++) {
			for (int j = 1; j <= num-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
scan.close();
	}

}
