package interview.ques;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeEx {
	private int id;
	private String name;
	private String dept;
	private int sal;

	public EmployeeEx(int id, String name, String dept, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}

}


public class HighestSalariedEmpByDept {

	public static void main(String[] args) {
         List<EmployeeEx> list = new ArrayList<>();
         list.add(new EmployeeEx(101, "Nag", "Dev", 100000));
         list.add(new EmployeeEx(102, "Sai", "Tester", 100000));
         list.add(new EmployeeEx(103, "Chinnapa", "TL", 200000));
         list.add(new EmployeeEx(104, "Ankit", "TL", 300000));
         list.add(new EmployeeEx(105, "Naveen", "Dev", 200000));
         list.add(new EmployeeEx(106, "Lohit", "Tester", 50000));
         
         Map<String, List<EmployeeEx>> map = list.stream().collect(Collectors.groupingBy(EmployeeEx::getDept));
         map.entrySet().forEach(System.out::println);
         
         System.out.println("----------------------------------");
         
         Map<String, EmployeeEx> maxSalEmpByDept = list.stream()
         .collect(Collectors.groupingBy(EmployeeEx::getDept, 
        		        Collectors.collectingAndThen(
        		             Collectors.maxBy(Comparator.comparingInt(EmployeeEx::getSal)), 
        		             Optional::get)));
         
         maxSalEmpByDept.forEach((t, e)-> System.out.println(t+":"+e));
	}

}

