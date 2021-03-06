package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_RemoveDublicateFromList {

	public static void main(String[] args) {

		/*
		 * Create a list by getting the list elements from user if there is duplicated
		 * elements remove them from the list. ​ Kullanıcıdan aldıgınız elemanlardan
		 * oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
		 */

		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		String str = "";

		while (!str.equalsIgnoreCase("q")) {
			System.out.println("Listeye eklemek için enter a basın çıkmak için q ya basın");
			str = scan.next();
			list.add(str);
		}
		list.remove(list.get(list.size() - 1));
		System.out.println("çıkış gerçekleşti, listeniz:\n" + list);

		removeDublicate(list);
		answer();
		
		scan.close();
	}

	private static void answer() {
		Scanner scan=new Scanner(System.in);
		List<Integer> girilenList = new ArrayList<Integer>();
		List<Integer> tekrarsizList = new ArrayList<Integer>();
		System.out.print("Listeye eklemek istedikleriniz sayilari giriniz\nGirisi bitirmek icin Q giriniz : ");

		String cikis = "";
		do {
			if (scan.hasNextInt()) {	// yanında int değer varsa işleme deam et yoksa bitir
				int giris = scan.nextInt();
				girilenList.add(giris);
				if (!tekrarsizList.contains(giris)) {
					tekrarsizList.add(giris);
				}
			} else {
				cikis = "Q";
			}

		} while (!cikis.equals("Q"));

		System.out.println("Girilen   liste ==>" + girilenList + "\nTekrarsiz liste ==>" + tekrarsizList);
		
	}

	private static void removeDublicate(List<String> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equalsIgnoreCase(list.get(j))) {
					list.remove(j);
					j--;	//Eleman atlamamak için j yi eksiltmemiz gerekiyor
				}
			}
		}
		System.out.println("tekrarsız listeniz : " + list);
	}

}
