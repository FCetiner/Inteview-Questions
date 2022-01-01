package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q14_2_Answer {

	public static void main(String[] args) {
		String arr[]={ "3","5", "1", "2", "7", "9", "2", "3", "5", "7" };

		ardýþýkTopla(arr);
	}

	private static void ardýþýkTopla(String[] arr) {
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
