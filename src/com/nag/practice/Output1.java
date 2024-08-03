package interview.ques;

import java.util.ArrayList;
import java.util.List;

interface Animal{
	void eat();
}

class Cat implements Animal{
	@Override
	public void eat() {
	   System.out.println("Cat");
	}
}

class Dog implements Animal{
	@Override
	public void eat() {
	   System.out.println("Dog");
	}
}

public class Output1 {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Cat());
        list.add(new Dog());
        
        for(Animal a:list) {
        	a.eat();
        }
	}

}
