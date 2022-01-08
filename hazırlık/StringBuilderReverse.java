package hazýrlýk;

public class StringBuilderReverse {

	public static void main(String[] args) {
		
		StringBuilder stb=new StringBuilder();
		


		stb.append("Murat"); // stb.reverse()=taruM
		
		System.out.println(stb.equals(stb.reverse())); //true 
		//StringBuilder use the same location, STB is MUTABLE
		
		String name="Ali";//ali deleted when we create murat
		name="Murat";  //in string we are always cratin new object String IMMUTABLE
		
		//STB keeps in same memory location
		//if you want to compare the just the values u use String
		
	}

}
