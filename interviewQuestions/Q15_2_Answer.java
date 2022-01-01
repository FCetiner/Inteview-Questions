package interviewQuestions;

import java.util.Scanner;

public class Q15_2_Answer {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter a number");
	        int num = scan.nextInt();
	        for (int i = 0; i < num; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
scan.close();
	}

}
