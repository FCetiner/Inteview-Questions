package interviewQuestions;

public class Q01_1_StringiTerstenYazdýrma {

	public static void main(String[] args) {
		/*
		Girilen bir String'i tersten yazdiran bir pr create ediniz
		 */
		
		String str= "Azra Ada ÇETÝNER";
		
		String harfler []= str.split("");
		String tersHarfler []= new String[harfler.length];
		
		for (int i = 0; i < tersHarfler.length; i++) {
			tersHarfler[i]=harfler[harfler.length-1-i];
		}

		//System.out.println(Arrays.toString(tersHarfler));	//[R, E, N, Ý, T, E, Ç,  , a, d, A,  , a, r, z, A]
		String isimYeni="";
		for (int i = 0; i < tersHarfler.length; i++) {
			isimYeni+=tersHarfler[i];
		}
	System.out.println(isimYeni);
	}

}
