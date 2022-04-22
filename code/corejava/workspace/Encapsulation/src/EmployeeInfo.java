
public class EmployeeInfo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.name = "Abc";
		emp.id = 123;
		emp.salary = 123123.12;
		emp.mobNo = "567567567565465464";
		//Mobile number validation logic
		emp.displayDetails();
	}
}


class Employee {
	String name;
	int id;
	double salary;
	String mobNo;
	
	public void displayDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Contact : " + mobNo);
	}
}
