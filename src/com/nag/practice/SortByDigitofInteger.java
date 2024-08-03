package interview.ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByDigitofInteger {

	public static void main(String[] args) {
		//input -[515, 341, 98] , output - [551, 431, 98]
		List<Integer> list = Arrays.asList(515, 341, 98);
		List<Integer> newList = new ArrayList<>();
	    
	    for(int i: list){
	       int number = sortOfDigits(i);
	       newList.add(number);
	    }
	    
	    System.out.println("Final List: "+newList);
	}
	
	private static int sortOfDigits(int num) {
		String s = Integer.toString(num);
		int[] arr = new int[s.length()];
		int count=0;
		int temp=0;
		while( num > 0) {
			int r = num % 10;
			arr[count++] = r;
			num = num/10;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int res=0;
		for (int i:arr) {
			res = (res*10)+i;
		}
		
		System.out.println(Arrays.toString(arr));
		
		return res;
	}

}
