package interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q03_2_Answer {

	public static void main(String[] args) {
		String str = "Ali came to school and Ayse came to school";
        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        
        Map<String,Integer> numOfWords = new HashMap<>();

        for(String w: words) {
            if(numOfWords.containsKey(w)) {
                numOfWords.put(w, numOfWords.get(w)+1);
            }else {
                numOfWords.put(w, 1);
            }
//		System.out.println(numOfWords);
        }
        System.out.println(numOfWords);

	}

}
