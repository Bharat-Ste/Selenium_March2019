package Assignments_Functions_constutors;

import java.util.Scanner;

public class All_Assignments {

	public static void main(String[] args) 
	{
		sum_inputNumbersUsingConsole(); 								// Assignment 1.
        System.out.println("Product is : " + returnProduct( 3, 2));     // Assignment 2
        areaOfCircle();  												// Assignment 3
        max_min_check();												// Assignment 4
		even_Odd_number_check();										// Assignment 5
			
		vote_eligibilityCheck(); 										// Assignment 7	
		grades();														// Assignment 8
		Factorial();												    // Assignment 9
	}
	
	/**
	 *  Assignment 1. Write a program to print the sum of two numbers entered by user by defining your own method.
	 */

	public static void sum_inputNumbersUsingConsole()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Assignment 1. Write a program to print the sum of two numbers entered by user by defining your own method.");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int first = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int Second = sc.nextInt();
		
		System.out.println("Sum of two numbers are : " + (first+Second));
		
	}
	
	/**
	 * Assignment 2. Define a method that returns the product of two numbers entered by user.
	 * @param fNum
	 * @param sNum
	 * @return
	 */
	
	public static int returnProduct(int fNum, int sNum) 
	{
		System.out.println();
		System.out.println("Assignment 2. Define a method that returns the product of two numbers entered by user.");
		System.out.println();
	    int prod=0;
	    prod = (fNum*sNum);
		
		return prod;
	}
	
	/**
	 *  Assignment 3: Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	 */
	
	public static void areaOfCircle() 
	{
		//A=πr2
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Assignment 3: Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Redius : ");
		float radius = sc.nextFloat();
		
		/**
		 * Area	= π (r*r) 

		 */
		
		double area;
		area = 3.14 * (radius * radius);
		System.out.println("area of a circle with radius " +radius + " is : "  + area );
		
		
	}

	/**
	 *  Assignment 4: Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	 */

	public static void max_min_check()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Assignment 4: Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.");
		System.out.println();
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a= num1.nextInt();
		
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("Enter Second number : ");
		int b= num2.nextInt();
		
		Scanner num3 = new Scanner(System.in);
		System.out.println("Enter third number : ");
		int c= num3.nextInt();
		
	//45 3 25
		
		if(a<b)
		{
			if(a<c) 
			{
				System.out.println("Smaller Number is : " + a);            // 10 40 50
				System.out.println("Biggest numver is " + c);
			}
			else    
			{
				System.out.println("Smaller Number is " + c);                // 30 50 10
				if(a>b) 
				{
					System.out.println("Bigger Number is : " + a);
				}
				else
				{
					System.out.println("Bigger Number is : " + b);
				}
				
			}
		}
		else if(a>b)
		{
			if(a>c) 
			{
				System.out.println("Biggest number is " + a);              // 50 40 30
				if(c<b)
				{
					System.out.println("Smallest number is " + c);
				}
				else
				{
					System.out.println("Smallest number is " + b);
				}
			}
			else    
			{
				System.out.println("Biggest numver is " + c);             // 70 60 80
				if(a<b)
				{
					System.out.println("Smallest number is " + a);
				}
				else
				{
					System.out.println("Smallest number is " + b);
				}
				
			}
		}
		
		
		
		
		
		
		
	}

   
	/*
	 * Assignment 5. Define a program to find out whether a given number is even or odd.
	 */

    public static void even_Odd_number_check()
	{
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Assignment 5. Define a program to find out whether a given number is even or odd.");
		System.out.println();
		
		String aa = scannerClass(2,2);
		
		String ar[] = aa.split(",");

		
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);

        if(a%2==0 & b%2==0)
        {
        	System.out.println(" Both a & b are even number's : ");
        }
        else if (a%2==0 & b%2!=0)
        {
        	System.out.println(" First number is a even number : " + a);
        	System.out.println(" Second number a Odd number : " + b);
        }	
        else if (a%2!=0 & b%2==0)
        {
        	System.out.println(" First number is Odd number : " + a);
        	System.out.println(" Second number is even number : " + b);
        }	
        else if (a%2!=0 & b%2!=0)
        {
        	System.out.println(" First number is Odd number : " + a);
        	System.out.println(" Second number a Odd number : " + b);
        }
		
		
		
	}
	
	/*
	 * Assignment 6. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
	 */
	public static void vote_eligibilityCheck()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Assignment 6. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.");
		System.out.println();
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter Voter Name :");
		String name= num1.nextLine();
		
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("Enter your Age  :");
		int age= num2.nextInt();
		
		if(age>=18)
		{
			System.out.println(name + " is eligible to vote! ");
		}
		else
		{
			System.out.println(name + " is not eligible to vote, his/her age is :" + age + "yrs, But accepted age criteara is : 18yrs" );
		}
		
		
	}
	
	/*
	 * Assignment 7. Define a method to find out if number is prime or not.
	 */
	public static void check_PrimeNumber()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Assignment 5. Define a program to find out whether a given number is even or odd.");
		System.out.println();
		
		int aa = scannerClass(2);
   
	}
	
	
	
	/**
	 * Assignment 8. Write a program which will ask the user to enter his/her marks (out of 100). 
         Define a method that will display grades according to the marks entered as below:
         	Marks        Grade
			91-100         AA
			81-90          AB
			71-80          BB
			61-70          BC
			51-60          CD
			41-50          DD
			<=40          Fail
	 */
	public static void grades()
	{
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Assignment 8. Write a program which will ask the user to enter his/her marks (out of 100)");
		System.out.println();
		int marks = scannerClass_grades(2);
		
		
		
		if(marks>=91 & marks<=100)
		{
			System.out.println("Grade : AA");
		}
		else if(marks>=81 & marks<=90)
		{
			System.out.println("Grade : AB");
		}
		else if(marks>=71 & marks<=80)
		{
			System.out.println("Grade : BB");
		}
		else if(marks>=61 & marks<=70)
		{
			System.out.println("Grade : BC");
		}
		else if(marks>=51 & marks<=60)
		{
			System.out.println("Grade : CD");
		}
		else if(marks>=41 & marks<=50)
		{
			System.out.println("Grade : DD");
		}
		else
		{
			System.out.println("FAILED");
		}
		
	}
	
     /*Assignment 9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
			Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
			4! = 1*2*3*4 = 24
			3! = 3*2*1 = 6
			2! = 2*1 = 2
			Also,
			1! = 1
			0! = 0
	 *
	 * 
	 */
	
	public static void Factorial()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Assignment 9. Write a program to print the factorial of a number by defining a method named 'Factorial'.");
		System.out.println();
		int num = scannerClass_msg(2," Factorial of number : ");
		int fect=1;
		
		for(int i=num;i>=1;i--)	
		{
			fect=fect*i;
			
		}
		
		System.out.println("Fectorail of number "+ num+" is = " + fect);
	}
	
	
	
	public static int scannerClass_msg(int a,String msg)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println( msg );
		int var = sc.nextInt();
		return var;
		
	}
	
	public static int scannerClass_grades(int a)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println( "Enter his/her marks (out of 100) : " );
		int var = sc.nextInt();
		return var;
		
	}
	public static int scannerClass(int a)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println( "Enter number : " );
		int var = sc.nextInt();
		return var;
		
	}
	public static String scannerClass(int a, int b)
	{
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter First number :");
		int aa= num1.nextInt();
		
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("Enter Second number :");
		int bb= num2.nextInt();
		
		String var= aa+","+bb;
		
		return var;
		
	}
	public static String scannerClass(int a, int b, int c,String msg)
	{
		
		Scanner num1 = new Scanner(System.in);
		System.out.println(msg);
		int aa= num1.nextInt();
		
		
		Scanner num2 = new Scanner(System.in);
		System.out.println(msg);
		int bb= num2.nextInt();
		
		Scanner num3 = new Scanner(System.in);
		System.out.println(msg);
		int cc= num3.nextInt();
		
		String var= aa+","+bb+","+cc;
		
		return var;
		
	}
	
	

}
