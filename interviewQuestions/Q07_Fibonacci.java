package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_Fibonacci {

	public static void main(String[] args) {
		/*
		Fibonacci dizisi create ediniz.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Array'in S�n�r�n� girin : ");
		int s�n�r=scan.nextInt();
		
		List <Integer> fibo = new ArrayList <>();
		
		fibo.add(1);
		fibo.add(1);
		
		
		for (int i = 2; i < s�n�r; i++) {
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
		}
		System.out.println(fibo);
		
scan.close();
	}

}
