package interview.ques;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 5, 7, 8);

		List<String> resultList  = list.stream().map(i -> i%2==0?"EVEN":"ODD").collect(Collectors.toList());
        System.out.println(resultList);
        
        List<Integer> evenList  = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        List<Integer> oddList  = list.stream().filter(i -> i%2!=0).collect(Collectors.toList());
        
        List<Integer> result = Stream.of(evenList, oddList).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(result);
	}

}
