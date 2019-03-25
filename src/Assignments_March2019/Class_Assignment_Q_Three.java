package Assignments_March2019;

public class Class_Assignment_Q_Three {

	/*

		Question 3: Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 
		'Employee'. The output should be as follows:
		
		Name        Year of joining        Address
		Robert            1994                64C- WallsStreat
		Sam                2000                68D- WallsStreat
		John                1999                26B- WallsStreat
		
		Solution : Code Below
	 * */
	
	public String name;
	public String yearOfJoining;
	public int salary;
	public String address;
	public static boolean check=false;
	
	public Class_Assignment_Q_Three()
	{
		
	}
	
	public Class_Assignment_Q_Three(String name, String yearOfJoining,int salary,String address)
	{
		this.name=name;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
		this.address=address;

		System.out.println(name + "   " + yearOfJoining + "  " + salary + "  " + address);
		
		
	}
	
	public static void main(String[] args) 
	{
		
		
		if(check == false)
		{   System.out.println("-------------------------------------------");
			System.out.println("name" + "  " + "yearOfJoining" + "   " + "salary" + "   " + "address");
		    System.out.println("-------------------------------------------");
		}
		
		check = true;
		
		Class_Assignment_Q_Three emp1= new Class_Assignment_Q_Three("Naveen","20-09-2009",200000,"Florida");
		Class_Assignment_Q_Three emp2= new Class_Assignment_Q_Three("Bharat","20-01-2017",50000,"Noida");
		Class_Assignment_Q_Three emp3= new Class_Assignment_Q_Three("Shravi","20-09-2016",80000,"Delhi");
		
		

	}

}
