package Assignments_Functions_constutors;

public class consutctor_assignment_First {
/**
 * Q1. 
	Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. 
	Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
		1 - without any parameter - no amount will be added to the Piggie Bank
		2 - having a parameter which is the amount that will be added to Piggie Bank
	Create object of the 'AddAmount' class and display the final amount in Piggie Bank.
	________________________________
	
 */
	int innitialAmt = 50;
	
	public consutctor_assignment_First()
	{
		System.out.println("Initial Amount in Piggi Bank is $ " + innitialAmt);
	}
	public consutctor_assignment_First(int addAmt)
	{
		innitialAmt = innitialAmt + addAmt;
		System.out.println("Piggie Bank updated Amount is $ "+ innitialAmt);
		
	}
	public static void main(String[] args) 
	{
		addAmount(0);

	}
	
	public static void addAmount(int amount)
	{
		consutctor_assignment_First ca=  new consutctor_assignment_First();
		consutctor_assignment_First ca1=  new consutctor_assignment_First(amount);
	}

}
