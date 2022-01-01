package interviewQuestions;

import java.util.Scanner;

public class Q15_1_YýldýzUcgen {

	public static void main(String[] args) {
		/*

		Ask user to enter the number of lines of a half pyramid.
		Type a program to create the half pyramid.
		For exampleif the number of lines is 5, the pyramid will be  like;
		*
		* *
		* * *
		* * * *
		* * * * *

		Kullanýcýnýn  girdigi satýr sayýsý kadar yarým piramid sekli yazdýran bir program create ediniz.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of lines of a half pyramid.");
		int num=scan.nextInt();
		
		for (int satýr = 0; satýr <= num; satýr++) {
			for (int sutun = 0; sutun < satýr; sutun++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}

		scan.close();
	}

}
