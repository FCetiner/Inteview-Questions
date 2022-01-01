package interviewQuestions;

public class Q02_1_ArmstrongNumber {

	public static void main(String[] args) {
		/* 
	      Check if the integer is an Armstrong numbers
	       Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
	         153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
	         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
	*/

		int num = 153;
		int say�=num;
		
		int toplam=0;
		int a=0;
		while (say�>0) {
			a=0;
			a=(say�%10);
			toplam+=(a*a*a);
			say�/=10;
		}
		System.out.println(toplam);
		if (num ==toplam) {
			System.out.println("Say� Armstrong say�d�r");
		} else {
			System.out.println("Say� Armstrong say� de�ildir");
		}
	}

}
