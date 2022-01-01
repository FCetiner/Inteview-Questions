package interviewQuestions;

public class Q06_1_FindRepeatedCharacter {

	public static void main(String[] args) {
		/*
		 * Create method that finds repeated characters in a String Bir String'de
		 * tekrarlanan karakterleri bulan method create ediniz
		 */

		String str = "Basa basa";

		findRepeated(str);

	}

	private static void findRepeated(String str) {
		String arr[] = str.toLowerCase().split("");

		String repeated="";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].contains(arr[j])) {
					if (!repeated.contains(arr[i])) {
						repeated+=arr[i]+" ";
					}
				}
			}
		}
		System.out.println("Tekrarlanan karakterler : " + repeated);
	}

}
