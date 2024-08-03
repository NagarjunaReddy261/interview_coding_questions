package interview.ques;

public class PairOfIndexes {

	public static void main(String[] args) {
		int[] arr = {2,5,8,9,3,6};
		
		for(int i=0; i< arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				int k = arr[i];
				int z = arr[j];
				if(k+z == 11) {
					System.out.println("i:"+i+" "+arr[i]+" + j:"+j+" "+arr[j] +" = "+11);
				}
			}
			
		}

	}

}
