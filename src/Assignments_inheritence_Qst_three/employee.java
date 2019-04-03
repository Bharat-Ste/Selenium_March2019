package Assignments_inheritence_Qst_three;

public class employee extends Member{

	public String specialization;
	public String department;
	
	/**
	 * 		Now, assign name, age, phone number, 
			address and salary to an employee and a manager by making an object of both of these classes and print the same.
	 */
	
	public String get_employeeDetails(String specialization,String department)
	{
	   this.department=department;
	   this.specialization=specialization;
	   String depSpec= department+","+specialization;
	   
	   return depSpec;
	
	}
	
	
}
