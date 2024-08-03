package interview.ques;

interface SampleOne{
	default void show() {
		System.out.println("SampleOne");
	}
}

interface SampleTwo{
	default void show() {
		System.out.println("SampleTwo");
	}
}

public class MulInheritInterfaceEx implements SampleOne, SampleTwo{

	public static void main(String[] args) {
		MulInheritInterfaceEx ex = new MulInheritInterfaceEx();
        ex.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		SampleTwo.super.show();
	}

}
