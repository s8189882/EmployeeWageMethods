
public class EmployeeWage {
	
	public static void main(String[] args) {
		
		int present = 1;
		
		System.out.println("Welcome to Employee Wage Computation Program!");
		
		EmployeeWage emp = new EmployeeWage();
		emp.attend(present);
		
	}
	
	public void attend(int IS_FULL_TIME) {
		double empCheck = Math.floor(Math.random() * 10) % 2;
 		if (empCheck == IS_FULL_TIME)
 			System.out.println("Employee is Present");
 		else
 			System.out.println("Employee is Absent");
 		
	}

}
