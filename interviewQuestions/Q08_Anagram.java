package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_Anagram {

	public static void main(String[] args) {
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams

		Kullan�c�dan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter say�lar� ayn�ysa "Anagram" yazd�r�n,   aksi takdirde konsolda "Anagram De�il" yazd�r�n.
		Ornek : "Pide" ve"ED�P" anagram ifadelerdir..

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 String");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		
		isAnagram(str1,str2);
		answer(str1,str2);
		
		scan.close();

	}

	private static void answer(String str1, String str2) {
		 String arr1[] = str1.toLowerCase().split("");
         String arr2[] = str2.toLowerCase().split("");
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         if (Arrays.equals(arr1, arr2))
             System.out.println(str1+" is Anagram");
         else System.out.println(str1+"  is Not Anagram");
		
	}

	private static void isAnagram(String str1, String str2) {
		String arr1[] = str1.toLowerCase().split("");
        String arr2[] = str2.toLowerCase().split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("not anagram");
		}
		
		
	}

}
