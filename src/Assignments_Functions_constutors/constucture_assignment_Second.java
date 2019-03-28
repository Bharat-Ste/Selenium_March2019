package Assignments_Functions_constutors;

public class constucture_assignment_Second {

	
	/**
	 * 
    Q2.
		Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, 
		then the message "I love programming languages" should be printed. If some String is passed to it, 
		then in place of "programming languages" the name of that String variable should be printed.
		For example, while creating object if we pass "Java", then "I love Java" should be printed.

	 */
  public constucture_assignment_Second()
  {
	  System.out.println("I Love Programming Languages.");
  }
	
  public constucture_assignment_Second(String msg)
  {
	  System.out.println("I Love"+ msg);
  }
	static void main(String[] args) 
	{
		constucture_assignment_Second cs1 = new constucture_assignment_Second();
		constucture_assignment_Second sc2=new  constucture_assignment_Second("JAVA");

	}

}
