package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q05_MountainArray {
	static List <Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		/*
		Mountain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value, decreasing constantly after the maximum value
		Not Mountain Array--> [5, 2, 7, 1, 4] 
		​
		Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk degerinden sonra surekli azalan deger aliyorsa Mountain Array'dir
		 */
		int maxIndex=0;
		
		getInfo();
		maxIndex =findMax(list);
		isMountainArray(maxIndex);
		answer();
		
	}


	private static void answer() {
		 int arr[] = {0, 2, 5, 3, 1};
	        List<Integer> list = new ArrayList<>();	//boş list oluşturulmuş
	        for (Integer w : arr) {
	            list.add(w);
	        }
	        System.out.println(list);//list'i yazdirdik [0, 2, 5, 3, 1]
	        //Array'deki max elemani bulalim..
	        Arrays.sort(arr);//Arr siralandi			//Max eleman sort ile kolayca bulunabilirdi fero
	        int maxEleman = arr[arr.length - 1];// arr max eleamnı maxEleman'a atandi
	        System.out.println("arr'in en buyuk elemanı :" + maxEleman);// 5

	        //Array'in maxElemanina kadar olan elemanlari bir liste atandi
	        List<Integer> listIlk = new ArrayList<>();
	        for (int i = 0; i <= list.indexOf(maxEleman); i++) {
	            listIlk.add(list.get(i));
	        }
	        System.out.println("en buyuk elemana kadar olan elemanlar  :" + listIlk);// [0, 2, 5]
	        // maxElelmana kadar olan elemanlar sirali bir liste atanip sıralandi
	        List<Integer> listIlkSirali = new ArrayList<>();
	        for (Integer w : listIlk) {
	            listIlkSirali.add(w);
	        }
	        Collections.sort(listIlkSirali);
	        if (listIlk.equals(listIlkSirali)) {
	            System.out.println("ilk sart saglandi");
	        } else System.out.println("ilk sart saglanmadi !!!!!");
	        //Array'in maxElemanindan sonraki  elemanlari bir liste atandi
	        List<Integer> listSon = new ArrayList<>();
	        for (int i = list.indexOf(maxEleman); i < list.size(); i++) {
	            listSon.add(list.get(i));
	        }
	        System.out.println("en buyuk elemandan sonraki kalan n elemanlar  :" + listSon);// [3, 1]
	        // maxElelmandan sonraki  elemanlar sirali bir liste atanip sondan sıralandi
	        List<Integer> listSonSirali = new ArrayList<>();
	        for (Integer w : listSon) {
	            listSonSirali.add(w);
	        }
	        
	        Collections.sort(listSonSirali);
	        Collections.reverse(listSonSirali);
	        System.out.println(listSonSirali);
	        if (listSon.equals(listSonSirali)) {
	            System.out.println("ikinci sart saglandi");
	        } else System.out.println("ikinci sart saglanmadi !!!!!");
	        //sonuc​
	        if (listIlk.equals(listIlkSirali) && listSon.equals(listSonSirali)) {
	            System.out.println("Array MOUNTAIN ARRAY'dir");
	        } else System.out.println(" xxxx Array MOUNTAIN ARRAY degildir !!! ");
		
	}


	private static void isMountainArray(int maxIndex) {
	
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
