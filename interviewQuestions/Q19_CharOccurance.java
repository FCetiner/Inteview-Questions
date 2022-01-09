package interviewQuestions;


public class Q19_CharOccurance {

	public static void main(String[] args) {
		 /* Char occurences in a String
          input : "aaabbccccddddd"
          output : a3b2c4d5

          verilen bir string'deki tekrarlayan character'leri ve tekrar sayisini yazdýrýnýz.
         */

		String str="aaabbccccddddd";
		
		
		findOccurance(str);
	}

	private static void findOccurance(String str) {
	
		String kova="";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			count=0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if (count!=0 && !kova.contains(str.substring(i, i+1))) {
				kova+=str.charAt(i);
				System.out.print(str.charAt(i)+""+count);
			}
		}

		
	}

}
