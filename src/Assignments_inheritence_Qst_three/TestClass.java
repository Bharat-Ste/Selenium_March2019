package Assignments_inheritence_Qst_three;

public class TestClass {

	public static void main(String[] args) 
	{
		
		// Employee
		employee em =new employee();
		String dep= em.get_employeeDetails("Automation", "QA");
		String delimiter = ",";
		System.out.println(dep);
		String[] empDet= dep.split(delimiter);
		System.out.println("Employee Designation is : " + empDet[0] + " and Specilisation in : " + empDet[1]);
		System.out.println("Sal is :" + em.prnt_salary("bharat", 22, "+91 2637263928", "address_ obc", 20000));
		
		System.out.println("________________________________________");
		// Manager
		manager ma =new manager();
		String dep1= ma.get_ManagerDetails("Resource Manager", "HR");
		String delimiter1 = ",";
		System.out.println(dep1);
		String[] manDet= dep1.split(delimiter1);
		System.out.println("Manager Designation is : " + manDet[0] + " and Specilisation in : " + manDet[1]);
		System.out.println("Sal is :" + ma.prnt_salary("Raghav", 31, "+91 262343928", "Noida", 60000));
		
		
	}

}
