package interview.ques;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToList {

	public static void main(String[] args) {
		String str = "This is an Interview";
		
		List<String> list = Stream.of(str.split(" ")).collect(Collectors.toList());
		System.out.println(list);
		
		String s = list.stream().collect(Collectors.joining(" "));
		System.out.println(s);
	}

}
