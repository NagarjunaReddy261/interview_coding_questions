package interview.ques;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 4, 2, 6};
		int n = arr.length;
        int sumOfAll = ((n+1)*(n+2))/2;
        int sumOfArray = 0;
        
        for(int i=0; i < arr.length; i++) {
        	System.out.println("i -> "+arr[i]);
        	sumOfArray = sumOfArray+arr[i];
        }
        System.out.println("sumOfAll: "+sumOfAll+", sumOfArray: "+sumOfArray);
        int missingNumber = sumOfAll - sumOfArray;
        System.out.println("missingNumber -> "+missingNumber);
	}

}
