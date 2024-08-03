package interview.ques;

import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(13, 11, 20, 15, 33);
		
		Object[] arr = list.stream().toArray();
		
		System.out.println(Arrays.toString(arr));

	}

}
