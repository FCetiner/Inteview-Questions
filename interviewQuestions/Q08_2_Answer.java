package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_2_Answer {

	public static void main(String[] args) {


		 Scanner scan = new Scanner(System.in);
		 
		         System.out.print("1.Word : ");
		         String str1 = scan.next().toLowerCase(); // harflerin tamami kucuk
		 
		         System.out.print("2.Word : ");
		         String str2 = scan.next().toLowerCase();
		 
		         String arr1[] = str1.toLowerCase().split("");
		         String arr2[] = str2.toLowerCase().split("");
		         Arrays.sort(arr1);
		         Arrays.sort(arr2);
		         if (Arrays.equals(arr1, arr2))
		             System.out.println(str1+" is Anagram");
		         else System.out.println(str1+"  is Not Anagram");

		         
		         scan.close();
	}

}
