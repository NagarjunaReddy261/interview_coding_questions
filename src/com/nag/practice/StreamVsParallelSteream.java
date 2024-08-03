package interview.ques;

import java.util.Arrays;
import java.util.List;

public class StreamVsParallelSteream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		long start =0;
		long end =0;
		System.out.println("---------stream--------");
		start = System.currentTimeMillis();
		list.stream().forEach(i -> System.out.println(i+":"+Thread.currentThread().getName()));
		end = System.currentTimeMillis();
		System.out.println("start: "+start+", end: "+end+", time: "+(end - start));
		
		System.out.println("---------parallelStream--------");
		start = System.currentTimeMillis();
		list.parallelStream().forEach(i -> System.out.println(i+":"+Thread.currentThread().getName()));
		end = System.currentTimeMillis();
		System.out.println("start: "+start+", end: "+end+", time: "+(end - start));
	}

}
