package interviewQuestions;

public class Q13_2_Answer {

	public static void main(String[] args) {


		 System.out.println("Swap 1.Yol: 3. degisken kullanarak...  ************");
	        int a = 5;
	        int b = 7;
	        System.out.println("Swap öncesi :" + "a=" + a + " " + "b=" + b);
	        int c = a; //c=5;
	        a = b;// a=7;
	        b = c;//b=5
	        System.out.println("Swap sonrasý :" + "a=" + a + " " + "b=" + b);

	
	        // 2.Yol: 3. degisken kullanmadan...
	
	        System.out.println("Swap 2.Yol: 3. degisken kullanmadan...  ************");
	        System.out.println("Swap öncesi :" + "a=" + a + " " + "b=" + b);
	        a = a + b;//a=5+7=12
	        b = a - b;//b=12(a+b ile atanan yeni a deðeri) - 5(eski b deðeri)=7(eski a yeni           b deðeri)
	        a = a - b;//a=12(a+b ile atanan yeni a deðeri) - 7(yeni b deðeri) = 5(eski b yeni a deðeri)
	
	        System.out.println("Swap sonrasý :" + "a=" + a + " " + "b=" + b);
	    }

	

}
