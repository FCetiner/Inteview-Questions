package interviewQuestions;

import java.util.Scanner;

public class Q09_2_Answer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int num = scan.nextInt();
		boolean dividable = true;

		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				dividable = false;
				break;
			}
		}
		if (dividable)
			System.out.println("it is prime");
		else
			System.out.println("it is not prime");

		scan.close();
	}

}
