package interview.ques;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("a", "nagarjuna");
		hm.put("b", "nagarjuna");
		hm.put("a", "chinnapa");
		hm.put("c", "nag");
		hm.put(null, "nag");
		hm.put("1", null);
		System.out.println(hm.size());
		System.out.println(hm);
		
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("a", "nagarjuna");
		ht.put("b", "nagarjuna");
		ht.put("a", "chinnapa");
		ht.put("c", "nag");
		//ht.put(null, "nag");
		//ht.put("1", null);
		System.out.println(ht.size());
		System.out.println(ht);
		
	}

}
