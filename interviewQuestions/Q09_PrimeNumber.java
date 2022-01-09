package interviewQuestions;

import java.util.Scanner;

public class Q09_PrimeNumber {

	public static void main(String[] args) {
		/*
		Ask user enter a positive number and check if it is prime or not

		Kullan�c�dan pozitif bir say� girmesini isteyin ve asal olup olmad���n� kontrol edin
		 */
		
		Scanner scan = new Scanner(System.in);
	
		
		boolean out=false;
		
		do {
		System.out.println("L�tfen bir say� girin, ��kmak i�in 'q' bas�n");
		String num = scan.next().toLowerCase();
		if (!num.contains("q")) {
			isPrime(num);
		} else {
			System.out.println(num);
			out=true;
			
		}
	
		}while (!out );
		
		System.out.println("��k�� tamamland�");
		
		 
		scan.close();	
	
		
	}

	private static void isPrime(String num) {
		
		int say�=Integer.parseInt(num);
		
		int count=0;
		
		if (say�==0 || say�==1) {
			System.out.println("Not a Prime Number");
		} else if(say�<0){
			System.out.println("Negatif tamsay� girdiniz");
		} else {
			for (int i = 2; i <= say�/2; i++) {
			count=0;
			if (say�%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a Prime Number");
		}
		}
		
		
		
		
		
	}

}
