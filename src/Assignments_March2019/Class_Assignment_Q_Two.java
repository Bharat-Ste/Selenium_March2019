package Assignments_March2019;

public class Class_Assignment_Q_Two {
	/*

		Question 2: Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by 
		creating two objects of class 'Student'.
		
		Solution : Code Below
		

	 * */
	
	public static String name;
	public static String address;
	public static int rollNum;
	public static String phoneNumber;
	
	
	public static void main(String[] args) 
	{
		Class_Assignment_Q_Two emp1= new Class_Assignment_Q_Two();
		Class_Assignment_Q_Two emp2= new Class_Assignment_Q_Two();
		
		emp1.name="Sam";
		emp1.address="Calefornia";
		emp1.rollNum=16;
		emp1.phoneNumber="916 - XX - YYY";
		System.out.println(name + "       " + address + "  " + rollNum + "  "+ phoneNumber );

		emp1.name="Sabastian";
		emp1.address="Florida";
		emp1.rollNum=41;
		emp1.phoneNumber="918 - XX - YYY";
		System.out.println(name + "    " + address + "  " + rollNum + "  "+ phoneNumber );

	}

}
