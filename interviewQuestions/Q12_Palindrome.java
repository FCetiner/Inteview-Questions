package interviewQuestions;

import java.util.Scanner;

public class Q12_Palindrome {

	public static void main(String[] args) {
		/*
		Crteate a program checks if a String is PALINDROME or not.
		If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
		For Example : "madam" or "nurses run" .


		Kuulan�c�n�n girdi�i bir  String'in PALINDROME olup olmad���n� kontrol eden bir method create ediniz
		polindrome :Palindrom, tersten okunu�u da ayn� olan c�mle
		ornek : Ey edip Adana`da pide ye,  Tra� ni�in �art
		 */
		
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(isPalindrome(str));
		answer(str);
		scan.close();
	}

	private static void answer(String str) {
		   String tersStr = "";
			
	        for (int i = str.length() - 1; i >= 0; i--) {
	
	            tersStr += str.charAt(i);
	        }
	
	        System.out.println(tersStr);
	
	        if (tersStr.equalsIgnoreCase(str)) {
	
	            System.out.println("Girdiginiz metin PALINDROME'dur");
	
	        } else {
	
	            System.out.println("Girdiginiz metin PALINDROME degildir");
	        }
		
	}

	private static boolean isPalindrome(String str) {

		StringBuilder sb=new StringBuilder(str);
		return sb.toString().equalsIgnoreCase(sb.reverse().toString());
}
}
