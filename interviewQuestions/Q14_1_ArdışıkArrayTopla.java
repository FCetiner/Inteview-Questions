package interviewQuestions;

import java.util.ArrayList;

import java.util.List;

public class Q14_1_Ard���kArrayTopla {

	public static void main(String[] args) {
		
		 /*
		If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
		type a program to create a new array whose elements are like { 3, 5+1, 2+7+9, 2+3+5+7 }

		Verilen bir aray�n elemanlar�n�n ard���k artan toplam�n� hesaplay�p yeni bir array'a atayan bir program cretae ediniz..

		input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }

		output : { 3, 5+1, 2+7+9, 2+3+5+7 }

		   */
		String arr[]={ "3","5", "1", "2", "7", "9", "2", "3", "5", "7" };

		ard���kTopla(arr);
	}

	private static void ard���kTopla(String[] arr) {
		List<String> list=new ArrayList<>();
		int index=1;
		int sayac=0;
		do {
			String toplam="";
			
			for (int i = 0; i <= sayac; i++) {
				toplam += arr[index-1+i]+"+";
			}			
			sayac++;
			index += sayac;
			list.add(toplam);
		} while (sayac < arr.length/2-1);
		System.out.println(list);
		
	}

}
