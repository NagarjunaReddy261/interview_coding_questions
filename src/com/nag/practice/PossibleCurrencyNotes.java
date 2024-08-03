package interview.ques;

public class PossibleCurrencyNotes {

	public static void main(String[] args) {
		int Rs[] = {200,100,50,20,10};
		int amount = 6330;
		int count =0;
		for(int i=0;i<Rs.length;i++) {
			System.out.println(amount+" ->  "+Rs[i]);
			if(amount >= Rs[i]) {
			   count = count+ (amount/Rs[i]);
			   int indcount =amount/Rs[i];
			   System.out.println(Rs[i]+"rupees -> "+indcount);
			   amount = amount%Rs[i];
			   
		    }
	    }
		System.out.println("Total count: "+count);
	}
}
