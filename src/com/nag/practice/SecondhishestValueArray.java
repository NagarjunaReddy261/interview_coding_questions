package interview.ques;

import java.util.Arrays;

public class SecondhishestValueArray {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 10, 7, 9};
		int len = arr.length;
		System.out.println("len: "+len);
		
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));

		//System.out.println(arr[len-2]);
		
		int temp=0;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				System.out.println("arr[i]: "+ arr[i]+", arr[j]: "+arr[j]);
				if(arr[i]>arr[j]) {
					System.out.println("temp: "+ temp);
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[len-2]);
	}

}
