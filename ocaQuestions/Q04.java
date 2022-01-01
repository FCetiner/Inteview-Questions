package ocaQuestions;

public class Q04 {
	int i;
	static int j;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Q04 x1=new Q04();
		Q04 x2=new Q04();
		x1.i=3;
		x1.j=4;
		x2.i=5;
		x2.j=6;
		System.out.println(
				x1.i+" "+
				x1.j+" "+
				x2.i+" "+
				x2.j
				);
	}

}
