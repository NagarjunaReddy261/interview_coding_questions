package interview.ques;

class Parent {
	int num = 10;

	public void method1() {
		System.out.println("from Parent");
	}

}

class Child extends Parent {
	int num = 20;

	@Override
	public void method1() {
		System.out.println("from child");

	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		//Can't create parent object with child reference. We need to type cast to child class.
		//At Runtime we will get the classcastexception.
		//Child ch = new Parent();
		Parent ch = new Child();
		ch.method1();
		System.out.println(ch.num);

	}

}
