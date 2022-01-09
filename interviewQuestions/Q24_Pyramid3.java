package interviewQuestions;

public class Q24_Pyramid3 {

	public static void main(String[] args) {
		/*
		 * 1 2 3 2 3 4 5 4 3 4 5 6 7 6 5 4
		 * 
		 * Kullanýcýnýn girdigi satýr sayýsý kadar yukarýdaki yarým piramid sekli
		 * yazdýran bir program create ediniz.
		 */
		int num = 4;

		solution1(num);
		solution2(num);
	}

	private static void solution1(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			for (int j = 1; j < i; j++) {
				System.out.print(i + j + " ");
			}
			for (int k = i + i - 2; k > i - 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	private static void solution2(int num) {
		int control1=0;
		int control2=0;
		for(int i=1; i <= num;i++) {
			for(int j=1;j <=i;j++) {
				System.out.print(j+control1+" ");
				control2=j+control1;
			}
			for(int k=control2; k > i;k--) {
				System.out.print(k-1+" ");				
			}
			System.out.println();
			control1=i;	
		
	}

}
}
