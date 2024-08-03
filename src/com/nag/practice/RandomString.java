package interview.ques;

import org.apache.commons.lang.RandomStringUtils;

public class RandomString {

	public static void main(String[] args) {
		System.out.println(RandomStringUtils.randomAlphabetic(12));
		System.out.println(RandomStringUtils.randomAlphanumeric(12));
		System.out.println(RandomStringUtils.randomAscii(12));
		System.out.println(RandomStringUtils.randomNumeric(12));
	}

}
