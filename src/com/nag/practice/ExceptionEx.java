package interview.ques;

class Example {
	public void method1() throws RuntimeException{
		System.out.println("Example method1");
	}
}

public class ExceptionEx extends Example{
	
	public void method1() throws NullPointerException{
		System.out.println("ExceptionEx method1");
	}
	
	public void method2() throws RuntimeException{
		System.out.println("ExceptionEx method2");
	}

	public static void main(String[] args) {
		
		Example ex = new ExceptionEx();
		ex.method1();
		((ExceptionEx) ex).method2();
	}

}
