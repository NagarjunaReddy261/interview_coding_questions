package interview.ques;

public class Permutation {

	public static void main(String[] args) {
		String str = "ABC";
		permute(str, "");
	}
	
	static void permute(String s, String s2) {
		System.out.println("s: "+s+", s2: "+ s2);
		if(s.length() == 0) {
			System.out.println(s2 + " ");
			System.out.println("--------");
			return;
		} else {
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				System.out.println("0 , "+i+": "+s.substring(0, i)+", i+1: "+s.substring(i+1) );
				String ros = s.substring(0, i)+s.substring(i+1);
				System.out.println("ros: "+ros+", ch: "+ch );
				permute(ros, s2+ch);
			}
		}
	}
	
	
}
