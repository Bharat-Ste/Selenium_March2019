package Assignments_March2019;

public class Class_Assignment_Q_One {
	/*
	 *  Question 1: Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' 
	    and that of name as "John" by creating an object of the class Student.

        Solution : Code Below
	 * */
	
	
	public static String name;
	public static int rollNum;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Student("Johan",30);
		
		Class_Assignment_Q_One ca1= new Class_Assignment_Q_One();
		ca1.name="Sabastian";
		ca1.rollNum=25;
		
		System.out.println("Name is : "+ name +" & Roll Number is :" + rollNum );	
		
		Class_Assignment_Q_One ca2= new Class_Assignment_Q_One();
		ca2.name="Merry";
		ca2.rollNum=23;
		
		System.out.println("Name is : "+ name +" & Roll Number is :" + rollNum );	

	}
	
	public static void Student(String na,int rNum)
	{
		
		name=na;
		rollNum=rNum;
		System.out.println("Name is : "+ name +" & Roll Number is :" + rollNum );	
		
	}
	

}
