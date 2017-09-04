

class Employee{
	int salary;
	String name;
	static String company ="TCS";
	void set(int s,String st){
		salary =s;
		name =st;
	}
	void show(){
		System.out.println(salary);
		System.out.println(name);
	}
}

public class Main{
	public static void main(String args[]){

		Employee emp = new  Employee();
		emp.set(5000,"Raj");
		emp.show();
		System.out.println(emp.salary);
		System.out.println(Employee.company);
	}
}