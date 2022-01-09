package interviewQuestions;

public class Q04_FindPairsInArray {

	public static void main(String[] args) {
		/*
	    From a given array find all pairs whose sum is a given number
	verilen bir arraydeki, toplamý belirli bir sayý olan tüm çiftleri bulun
	           For example; 
	           input :  {4, 6, 5, -10, 8, 5, 20} ==> 10
	           Output :  4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10 
	 */
		
		int arr []= {4, 6, 5, -10, 8, 5, 20};
		int toplam=10;
		
		for (int i : arr) {
			for (int j : arr) {
				if ((i+j==toplam)) {
			System.out.print(i + " + " + j + " = " + toplam+", ");
		}	
			}
		}
		

		
	}



}
