package Assignments_inheritence_Qst_three;

public class manager extends Member
{
	public String specialization;
	public String department;
	
	public  String get_ManagerDetails(String specialization,String department)
	{
	   this.department=department;
	   this.specialization=specialization;
	   String depSpec= department+","+specialization;
	   
	   return depSpec;
	
	}
}
