package interviewQuestions;

import java.util.Scanner;

public class Q16_HalfPyramidWithNumbers {

	public static void main(String[] args) {
		/*
		 Ask user to enter the number of lines of a inverted half pyramid by using numbers.
		 Type a program to create the inverted half pyramid.
		 For example if the number of lines is 5, the pyramid will be like;

		 1 2 3 4 5
		 1 2 3 4
		 1 2 3
		 1 2
		 1

		 Kullanýcýnýn  girdigi satýr sayýsý kadar sayýlarla ters yarým piramid sekli yazdýran bir program create ediniz.

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=scan.nextInt();
		
		for (int satýr = 1; satýr <=num; satýr++) {
			for (int sutun = 1; sutun <=num+1-satýr; sutun++) {
				System.out.print(sutun+" ");
				
			}
			System.out.println();
		}
		
		
		
		scan.close();
		
	}

}
