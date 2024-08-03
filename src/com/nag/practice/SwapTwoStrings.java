package interview.ques;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String s1= "Nag";
		String s2= "Arjuna";
		
		s1=s1+s2;
		System.out.println(s1);
		s2=s1.substring(0, 3);
		System.out.println(s2);
		s1=s1.substring(3, 9);
		System.out.println(s1);
		
		String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: a- " + a + ", b- " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : a- " + a + ", b- " + b);  
		

	}

}
