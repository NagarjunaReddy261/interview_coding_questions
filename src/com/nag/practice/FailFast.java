package interview.ques;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {	
			String s = itr.next();
			System.out.println("s: "+s);
			if(s.equals("two")) {
				System.out.println("if");
				list.set(3, "three");
			}
		}
	}

}
