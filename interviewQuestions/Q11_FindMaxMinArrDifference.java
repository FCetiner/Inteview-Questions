package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q11_FindMaxMinArrDifference {

	public static void main(String[] args) {
		/*
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.

		kullanýcýnýn girdigi bir array'in en buyuk elemani ile 
		en kucuk elemanýnýn  farkýný bulan bir method create ediniz.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter arr's length");
		int length=scan.nextInt();
		int arr[]=new int [length];
	
		for (int i = 0; i < length; i++) {
			System.out.println("Enter arr elements");
			int a=scan.nextInt();
			arr[i]=a;
		
		}
		Arrays.sort(arr);
		int difference=arr[arr.length-1]-arr[0];
		
		System.out.println(difference);
		
		scan.close();
	}

}
