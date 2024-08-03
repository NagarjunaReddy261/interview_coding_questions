package interview.ques;
import java.util.Scanner;

public class MaximumNumberofNotes {

	public static void main(String[] args) {
		int Rs[] = {10,20,50,100,200};
		int[] noteCounter = new int[] {10,5,10,11,10};
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		sc.close();
		//int totalnotes =0,
		int count=0;
		//HashMap<String,Integer> hm = new HashMap<>();
		for(int i=0;i<5;i++) {
				System.out.println(amount +" -> "+noteCounter[i]*Rs[i]);
				if(amount == Rs[i]) {
					//hm.put(String.valueOf(Rs[i]),1);
					count = count+1;
				}else {
				  amount = amount - noteCounter[i]*Rs[i];
				  //hm.put(String.valueOf(Rs[i]),noteCounter[i]);
				  count = count+noteCounter[i];
				  System.out.println(amount);
				}
		}
//		System.out.println(hm);
//		for(int i=0;i<hm.size();i++) {
//			totalnotes = hm.get(String.valueOf(Rs[i]));
//			count = count+totalnotes;
//		}
		System.out.println(count);

	}

}
