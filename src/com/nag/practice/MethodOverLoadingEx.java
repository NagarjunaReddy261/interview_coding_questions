package interview.ques;

public class MethodOverLoadingEx {
	
	public String print(Integer i){
		System.out.println("Method Parameter Integer");
		return null;
	}

	public Integer print(String a){
        System.out.println("Method Parameter String");
		return null;
	}

	public static void main(String[] args) {
		MethodOverLoadingEx mol = new MethodOverLoadingEx();
		//mol.print(null);//The method print() is ambiguous for the type MethodOverLoadingEx
		mol.print("");
	}
}
