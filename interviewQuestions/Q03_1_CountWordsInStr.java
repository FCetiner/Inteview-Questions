package interviewQuestions;

import java.util.Arrays;

public class Q03_1_CountWordsInStr {

	public static void main(String[] args) {
		/*
		 * Count the words in a String one by one Girilen bir String'deki kelimeleri tek
		 * tek saydiran java code create ediniz.
		 * 
		 * For Example: Input : String is "Ali came to school and Ayse came to school"
		 * Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
		 */
		String cumle = "Ali came to school and Ayse came to school";

		String[] arr = cumle.split(" ");
		String str = "";

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i].contains(arr[j])) {
					count++;
				}
			}
			if (!str.contains(arr[i])) {
				str += arr[i] + "=" + count + "#";
			}
		}
		String arr2[] = str.split("#");
		System.out.println(Arrays.toString(arr2));
	}
}
