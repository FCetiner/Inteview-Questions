package interviewQuestions;


public class Q22_PrimeNumsLessThanaNum {

	public static void main(String[] args) {
		/*
		 * Print prime numbers which are less than or equal to the given number.
		 * 
		 * Verilen sayýdan küçük veya ona eþit olan asal sayýlarý yazdýrýnýz.
		 */
		int num = 30;

		findPrimeNum(num);

	}

	private static void findPrimeNum(int num) {
		int count=0;
		for (int i = 2; i <= num; i++) {
			count=0;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					count++;
					break;
				}
			
			}
			if (count==0) {
				System.out.print(i+" ");
			}
			
		}
	
	
	
	}
	
	  
}
