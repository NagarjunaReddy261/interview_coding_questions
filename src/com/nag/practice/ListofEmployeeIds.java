package interview.ques;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	private int id;
	private String name;
	private int sal;
	
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}

public class ListofEmployeeIds {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Harsha", 1000));
		list.add(new Employee(102, "Naveen", 2000));
		list.add(new Employee(103, "HemaChandra", 3000));
		
		List<Integer> idList = list.stream()
				.filter(e -> e.getName().startsWith("H"))
				.map(e -> e.getId()).collect(Collectors.toList());
        System.out.println(idList);
	}

}
