package interview.ques;

import java.util.Arrays;

public class StringReplace {

	public static void main(String[] args) {
		String S = "AABCABACKZ!*A";
		String result = S.replaceAll("AB", "2").replaceAll("A", "1");
		System.out.println(result);
		
		System.out.println(S);
		
		String resp =S.substring(0, S.indexOf("AB"))+"2"+S.substring(S.indexOf("AB")+2, S.length());
		
		System.out.println("index of AB: "+resp.indexOf("AB"));
		System.out.println("1st occurance AB replace: "+resp);
		resp = resp.substring(0, resp.indexOf("AB"))+"2"+resp.substring(resp.indexOf("AB")+2, resp.length());
		System.out.println("2nd occurance AB replace: "+resp);
		
		char arr[] = resp.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'A') {
				arr[i] = '1';
			}
		}
		
		System.out.println("final resp: "+Arrays.toString(arr));
		
		String res ="";
		for(char c:arr) {
			res += c;
		}
		
		System.out.println("final resp: "+res);
	}

}
