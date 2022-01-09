package interviewQuestions;

public class Q06_FindRepeatedCharacter {

	public static void main(String[] args) {
		/*
		 * Create method that finds repeated characters in a String Bir String'de
		 * tekrarlanan karakterleri bulan method create ediniz
		 */

		String str = "Basa basa";

		findRepeated(str);
		answer(str);

	}

	private static void answer(String str) {
		 tekrarlayanCharacterSay1(str, 'i');
	        tekrarlayanCharacterSay2(str, 'd');
	        tekrarlayanCharacterSayLambda(str);

}

	    public static void tekrarlayanCharacterSay1(String str, char val) {
	        int count = 0;
	        for (char ch : str.toCharArray()) {

	            if (ch == val) {
	                count++;
	            }
	        }
	        System.out.println("tekrarlayan character : " + val + ",  tekrar sayisi : " + count);
	    }

	    public static void tekrarlayanCharacterSay2(String str, char val) {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	
	            if (str.charAt(i) == val) {
	                count++;
	            }
	        }
	        System.out.println("tekrarlayan character : " + val + ",  tekrar sayisi : " + count);
	    }
	
	    public static void tekrarlayanCharacterSayLambda(String str) {
	        long count = str.chars()
	                .mapToObj(e -> String
	                        .valueOf((char) e))
	                .filter(e -> e.equals("a"))
	                .count();
	        System.out.println("tekrarlayan character   tekrar sayisi : " + count);
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
