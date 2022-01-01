package ocaQuestions;

public class Q01_SwitchCase {

	public static void main(String[] args) {

		char colorCode = 'y';

		switch (colorCode) {
		case 'r':
			@SuppressWarnings("unused") int color=100;
			break;
		case 'b':
			color=10;
			break;
		case 'y':
			color=1;
			break;

		}
	//	System.out.println(color); color case scope nda tanýmlandýgý için CTE verir
	}

}
