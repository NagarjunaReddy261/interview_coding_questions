package interview.ques;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);

		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("i: "+i);
			if(i == 200) {
				list.add(500);
			}
		}
//		for(int i: list) {
//			System.out.println("i: "+i);
//			if(i == 200) {
//				list.add(500);
//			}
//		}

		System.out.println("Final List: "+list);
	}

}
