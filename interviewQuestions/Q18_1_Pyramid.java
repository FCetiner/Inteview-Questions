package interviewQuestions;

public class Q18_1_Pyramid {

	public static void main(String[] args) {
		/*
		 Ask user to enter the number of lines of a  pyramid .
		 Type a program to create the pyramid.
		 For example if the number of lines is 5, the pyramid will be like;
		             *
		            * *
		           * * *
		          * * * *
		         * * * * *


		 Kullanýcýnýn  girdigi satýr sayýsý kadar * ile piramid sekli yazdýran bir program create ediniz.*/

		int num=5;
		
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  for (int satir = 0; satir < num; satir++) {
            for (int sutun = num; sutun > satir; sutun--) {			//Ters dik üçgen çiziyor satýr 0->5 ++ oluyor
	                System.out.print(" ");								// sutun 5->0 -- oluyor
	            }
	            for (int sutun = 0; sutun <= satir; sutun++) {
	                System.out.print("*");
	            }
	            for (int sutun = 0; sutun < satir; sutun++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	
	}
		
	}


