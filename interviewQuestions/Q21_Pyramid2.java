package interviewQuestions;

public class Q21_Pyramid2 {

	public static void main(String[] args) {
		/*
        Ask user to enter the number of lines of a inverted  .
        Type a program to create the inverted  pyramid.
        For example; if the number of lines is 5, the pyramid will be like;

        * * * *  * * * *
          * * * * * *
            * * * *
              * *
               *

        Kullanýcýnýn  girdigi satýr sayýsý kadar * ile  ters  piramid sekli yazdýran bir program create ediniz.

        */
		int num=8;
		
		for (int satir = num; satir > 0; satir--) {
			for (int i = 0; i < num-satir; i++) {
				System.out.print(" ");
			}
			for (int sutun = 0; sutun < satir; sutun++) {
				System.out.print("*");
				System.out.print(" ");
			}
			if (satir!=2 && satir!=1) {
				satir--;
			}
			
			System.out.println();
		}
		

	}

}
