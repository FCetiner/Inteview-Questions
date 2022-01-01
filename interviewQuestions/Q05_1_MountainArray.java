package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_1_MountainArray {
	static List <Integer> list = new ArrayList<>();
	static int maxIndex=0;
	public static void main(String[] args) {
		/*
		Mountain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value, decreasing constantly after the maximum value
		Not Mountain Array--> [5, 2, 7, 1, 4] 
		​
		Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk degerinden sonra surekli azalan deger aliyorsa Mountain Array'dir
		 */
		
		
		getInfo();
		maxIndex =findMax(list);
		isMountainArray();
		
		
	}


	private static void isMountainArray() {
	
		int control=0;
		for (int i = 0; i < maxIndex-1; i++) {
			if (!(list.get(i)<list.get(i+1))) {
				control++;		
				
			}
		}
		for (int i = maxIndex; i < list.size()-1; i++) {
			if (!(list.get(i)>list.get(i+1))) {
				control++;
			
				
			}
		}
		
		if (control==0) {
			System.out.println("it is a Mountain Array");
		} else {
			System.out.println("it is not a Mountain Array");
		}
		
	
	
		
	}


	private static int findMax(List<Integer> list) {
		int maxIndex=0;
		for (int i = 0; i < list.size(); i++) {
			if (maxIndex<list.get(i)) {
				maxIndex=i;
			}
		}
		
		return maxIndex;
		
		
	}


	private static List <Integer> getInfo() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Listin uzunluğunu girin");
		int uzunluk=scan.nextInt();
		
		
		for (int i = 0; i < uzunluk; i++) {
			System.out.println("Listin elemanlarını girin : ");
			list.add(scan.nextInt());
		
	}
		scan.close();
		return list;

	}
}
