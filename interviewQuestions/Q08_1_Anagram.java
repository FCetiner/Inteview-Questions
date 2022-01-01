package interviewQuestions;

import java.util.Scanner;

public class Q08_1_Anagram {

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
		
		char harfler1 []= str1.toLowerCase().toCharArray();
		char harfler2 []= str2.toLowerCase().toCharArray();
		
		
		int count=0;
		
			for (int i = 0; i < harfler2.length; i++) {
				for (int j = 0; j < harfler2.length; j++) {
					if (harfler1[i]==harfler2[j]) {
						count++;
					} 
				}
			}
		
		
		if (count==str1.length()) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
		
		scan.close();

	}

}
