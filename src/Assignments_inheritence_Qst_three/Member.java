package Assignments_inheritence_Qst_three;

public class Member 
{

	public String Name;
	public int Age;
	public String Phonenumber;
	public String Address;
	public static int Salary;
	
	public int prnt_salary(String name,int Age,String Phonenumber,String Address,int Salary)
	{
		
		
		this.Name=name;
		this.Age=Age;
		this.Phonenumber=Phonenumber;
		this.Address=Address;
		this.Salary=Salary;

		return Salary;
		
	}
}
