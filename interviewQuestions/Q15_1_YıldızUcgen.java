package interviewQuestions;

import java.util.Scanner;

public class Q15_1_Y�ld�zUcgen {

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

		Kullan�c�n�n  girdigi sat�r say�s� kadar yar�m piramid sekli yazd�ran bir program create ediniz.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of lines of a half pyramid.");
		int num=scan.nextInt();
		
		for (int sat�r = 0; sat�r <= num; sat�r++) {
			for (int sutun = 0; sutun < sat�r; sutun++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}

		scan.close();
	}

}
