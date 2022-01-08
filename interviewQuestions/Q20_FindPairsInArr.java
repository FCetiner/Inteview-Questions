package interviewQuestions;


public class Q20_FindPairsInArr {

	public static void main(String[] args) {
		/*
		 * 
		 * We are organizing a horse race with horses having distinct strengths. The
		 * strength of the horses is represented by an array of integers. In order to
		 * make the race competitive, your program should find out the pair of horses
		 * with similar str Farklý güçleri olan atlarla bir at yarýþý düzenliyor.
		 * Atlarýn gücü bir tamsayý dizi assign edilirse. bir birine yakýn güçlere sahip
		 * at çiftlerini bulunuz. For example :{3, 67, 9, 46, 55, 48} output : 46,48
		 * 
		 */

		int arr[] = { 3, 67, 9, 46, 55, 48 };

		
		findPairOfHorses(arr);

	}

	private static void findPairOfHorses(int[] arr) {
		int kova = 0;
		int enDusukFark = 10000;
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < arr.length; i++) {
			num1 = 0;
			num2 = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					if (arr[i] - arr[j] < 0) {
						kova = (-1 * (arr[i] - arr[j]));
					} else {

						kova = arr[i] - arr[j];
					}
					if (enDusukFark > kova) {
						enDusukFark = kova;
						num1 = arr[i];
						num2 = arr[j];
					}
				}

			}
			System.out.println("bir birine yakýn güçlere sahip at çiftleri : " + num1 + " " + num2);
			enDusukFark = 10000;
		}

	}

}
