package interviewQuestions;

public class TersDikUcgen {
public static void main(String[] args) {
	
	
	int num=5;
	
	for (int i = 0; i < num; i++) {					//Sola dayalý Ters dik üçgen çiziyor satýr 0->5 ++ oluyor
		for (int j = num; j > i; j--) {				// sutun 5->0 -- oluyor
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int i = 0; i < num; i++) {					//Sola dayalý dik üçgen
		for (int j = 0; j <= i; j++) {				//
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int i = 0; i < num; i++) {					//Sola dayalý dik üçgen
		for (int j = num; j > i; j--) {				//
			System.out.print(" ");
		}
		for (int k = 0; k <= i; k++) {			//Saða dayalý dük üçgen
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	for (int i = 0; i < num; i++) {					//Sola dayalý dik üçgen
		for (int j = 0; j <= i; j++) {				//
			System.out.print(" ");
		}
		for (int k = num; k >i; k--) {			//Saða dayalý ters dik üçgen
			System.out.print("*");
		}
		System.out.println();
	}
}
}
