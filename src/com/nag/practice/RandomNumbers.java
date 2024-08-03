package interview.ques;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumbers {

	public static void main(String[] args) {
		Random ran = new Random();
        ran.ints(3, 50, 100).forEach(i -> System.out.print(i+" "));
        System.out.println();
        System.out.println("Intstream - range method");
        IntStream.range(1, 10).forEach(i -> System.out.print(i+" "));
	}

}
