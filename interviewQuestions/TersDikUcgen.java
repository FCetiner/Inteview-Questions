package interviewQuestions;

public class TersDikUcgen {
public static void main(String[] args) {
	
	
	int num=5;
	
	for (int i = 0; i < num; i++) {					//Sola dayal� Ters dik ��gen �iziyor sat�r 0->5 ++ oluyor
		for (int j = num; j > i; j--) {				// sutun 5->0 -- oluyor
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int i = 0; i < num; i++) {					//Sola dayal� dik ��gen
		for (int j = 0; j <= i; j++) {				//
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int i = 0; i < num; i++) {					//Sola dayal� dik ��gen
		for (int j = num; j > i; j--) {				//
			System.out.print(" ");
		}
		for (int k = 0; k <= i; k++) {			//Sa�a dayal� d�k ��gen
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	for (int i = 0; i < num; i++) {					//Sola dayal� dik ��gen
		for (int j = 0; j <= i; j++) {				//
			System.out.print(" ");
		}
		for (int k = num; k >i; k--) {			//Sa�a dayal� ters dik ��gen
			System.out.print("*");
		}
		System.out.println();
	}
}
}
