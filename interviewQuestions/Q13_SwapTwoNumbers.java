package interviewQuestions;

public class Q13_SwapTwoNumbers {

	public static void main(String[] args) {

		 /*
	     Write a Java Program to swap two numbers
	         
	     Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini almasý islemidir.
	     iki yoldan yaptiginiz java kodunu yaziniz.
	     1.Yol: 3. degisken kullanarak
	     2.Yol: 3. degisken kullanmadan
	*/
		int a=3;
		int b=5;
		solution1(a,b);
		solution2(a,b);
		
		
		
	}

	private static void solution2(int a,int b) {
		a=a-b;	//a -2
		b=a+b;	//b 3
		a=b-a;
		System.out.println("deðiþimden sonra a :" +a +"\rdeðiþimden sonra b :" + b);
		
		
	}

	private static void solution1(int a,int b) {
		int kova;
		kova = a;
		a = b;
		b = kova;
		System.out.println("deðiþimden sonra a :" +a +"\rdeðiþimden sonra b :" + b);

	}

}
