package interviewQuestions;

import java.util.Arrays;

public class Q23_1_PutAllZerosToEnd {

	public static void main(String[] args) {
		 /*
        Ebay Interview Question:
        Put all zeros to end in a integer array
        Bir tamsayý dizisinde tüm sýfýrlarý sona koyan bir program create ediniz.

        input : {3, 0, 4, 2, 0}
        output: {3, 4, 2, 0, 0}
         */

		int arr[]={3,15,8,8,0,5,0, 0, 4, 2, 0};
		putAllZerosToEnd(arr);
		solution2(arr);
	}
	
	private static void solution2(int[] arr) {
		  int[] arr1= new int[arr.length];
	        int count=0;
	        int count1=1;
	        for(int i=0; i < arr.length;i++) {
	            
	            if(arr[i] != 0) {
	                arr1[count]=arr[i];
	                count++;                
	            }
	            if(arr[i] == 0) {
	                arr1[arr1.length-count1]=arr[i];
	                count1++;
	                
	            }
	        }
	        System.out.println("Input => " + Arrays.toString(arr));
	      
		
	}

	private static void putAllZerosToEnd(int[] arr) {
		
		int kova=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]<arr[j+1]) {
				kova=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=kova;
			}
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	

}
