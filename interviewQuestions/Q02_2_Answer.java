package interviewQuestions;

public class Q02_2_Answer {

	public static void main(String[] args) {
		 int sayi = 370;
	        int rakam;
	        int toplam = 0;
	        int number = sayi;
	        for (; number > 0; number = number / 10) {
	            rakam = number % 10;
	            toplam = toplam + rakam * rakam * rakam;
	        }
	        if (toplam == sayi) {
	            System.out.println("This is armstrong number");
	        }

	}

}
