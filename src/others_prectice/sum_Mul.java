package others_prectice;

import java.util.Scanner;

public class sum_Mul {

	public static void main(String[] args) 
	{
		
//		mutliply();
//		printTable();
		
		printUSFlasg();
	
		
	}
	/**
	 * 
	 */
	public static void mutliply()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first integer value :");
		int val1 = sc.nextInt();
		
		
		System.out.println("Enter Second integer value :");
		int val2 = sc.nextInt();
		
		System.out.println("Multiplication value is :" + (val1*val2));

	}
	public static void printTable()
	{
		// Create table of inserted number
		
		
		
				System.out.println("Print Table of :");
				int val3 = sc.nextInt();
				
				for(int i=1;i<=20;i++)
				{
					System.out.println(i + " X " + val3 + " = " + (i*val3));
				}
	}
	public static void printUSFlasg()
	{
		// Total rows = 15 coloms = 47, 9 (starts 6 & 5 With ===== )+ 6 (====)
		
				/*
				 	* * * * * * ==================================                          
					 * * * * *  ==================================                          
					* * * * * * ==================================                          
					 * * * * *  ==================================                          
					* * * * * * ==================================                          
					 * * * * *  ==================================                          
					* * * * * * ==================================                          
					 * * * * *  ==================================                          
					* * * * * * ==================================                          
					==============================================                          
					==============================================                          
					==============================================                          
					==============================================                          
					==============================================                          
					============================================== 
				  
				 */
				
				for(int j=1;j<=15;j++)
				{
					
					for(int k=1;k<=47;k++)
					{
  					if(k<=12)
  					{
  						System.out.print("*");
  					}
//  					else
//  					{
//  						System.out.print("=");
//  					}
  					System.out.print("=");
					}
					System.out.println();
				}
	}

}
