package interview.ques;

public class CapitalAndSmall {

	public static void main(String[] args) {
		String str = "heLLGFg";
		String str1= "Hello";
		
		System.out.println(traverseString(str));
		System.out.println(traverseString(str1));
		
		StringBuilder sb = new StringBuilder();
		str.chars().mapToObj(c -> (char) c).filter(s -> s.hashCode() > 96).forEach(c -> sb.append(c));
		str.chars().mapToObj(c -> (char) c).filter(s -> s.hashCode() < 96).forEach(c -> sb.append(c));
		System.out.println("sb: "+sb);
		
		StringBuilder sb1 = new StringBuilder();
		str1.chars().mapToObj(c -> (char) c).filter(s -> s.hashCode() > 96).forEach(c -> sb1.append(c));
		str1.chars().mapToObj(c -> (char) c).filter(s -> s.hashCode() < 96).forEach(c -> sb1.append(c));
		System.out.println("sb1: "+sb1);
	}
	
	public static String traverseString(String input) {
		String result="";
		String small="";
		String caps="";
		for(int i=0;i<input.length();i++) {
			String c = String.valueOf(input.charAt(i));
			if(c.hashCode() > 96) {
				small +=c;
			}else {
				caps +=c;
			}
		}
		result = small.concat(caps);
		return result;
	}

}
