package interviewQuestions;

import java.util.Scanner;

public class Q09_PrimeNumber {

	public static void main(String[] args) {
		/*
		Ask user enter a positive number and check if it is prime or not

		Kullanýcýdan pozitif bir sayý girmesini isteyin ve asal olup olmadýðýný kontrol edin
		 */
		
		Scanner scan = new Scanner(System.in);
	
		
		boolean out=false;
		
		do {
		System.out.println("Lütfen bir sayý girin, çýkmak için 'q' basýn");
		String num = scan.next().toLowerCase();
		if (!num.contains("q")) {
			isPrime(num);
		} else {
			System.out.println(num);
			out=true;
			
		}
	
		}while (!out );
		
		System.out.println("Çýkýþ tamamlandý");
		
		 
		scan.close();	
	
		
	}

	private static void isPrime(String num) {
		
		int sayý=Integer.parseInt(num);
		
		int count=0;
		
		if (sayý==0 || sayý==1) {
			System.out.println("Not a Prime Number");
		} else if(sayý<0){
			System.out.println("Negatif tamsayý girdiniz");
		} else {
			for (int i = 2; i <= sayý/2; i++) {
			count=0;
			if (sayý%i==0) {
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
