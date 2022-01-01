package interviewQuestions;

import java.util.Scanner;

public class Q12_1_Palindrome {

	public static void main(String[] args) {
		/*
		Crteate a program checks if a String is PALINDROME or not.
		If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
		For Example : "madam" or "nurses run" .


		Kuulanýcýnýn girdiði bir  String'in PALINDROME olup olmadýðýný kontrol eden bir method create ediniz
		polindrome :Palindrom, tersten okunuþu da ayný olan cümle
		ornek : Ey edip Adana`da pide ye,  Traþ niçin þart
		 */
		
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(isPalindrome(str));
		
		scan.close();
	}

	private static boolean isPalindrome(String str) {

		StringBuilder sb=new StringBuilder(str);
		return sb.toString().equalsIgnoreCase(sb.reverse().toString());
}
}
