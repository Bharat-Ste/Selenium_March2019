package others_prectice;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Print_an_Integer_Entered_by_the_User {

	public static void main(String[] args) 
	{
		
		Largest_Among_Three_Numbers();

//		alphbet_vovels_check();
//		swapTwoNumbers();
//		EvenOdd();
    }
	
	public static void Largest_Among_Three_Numbers()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Frirst number : ");
		int f1=sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter Second number : ");
		int f2=sc1.nextInt();
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter Third number : ");
		int f3=sc2.nextInt();
		
		/**
		 * f1 = 12
		 * f2 = 15
		 *  f3 = 10
		 */
		if(f1 < f2 )
		{
//			System.out.println(f2 + " : is grater than f1");
			if(f1<f3)
			{
				System.out.println("f1 : " + f1 + " , f2 : " + f2 +" , f3 : " + f3);
				System.out.println(f1 + " : is less than f2 and f3");
			}
			else
			{
				System.out.println("f1 : " + f1 + " , f2 : " + f2 +" , f3 : " + f3);
				System.out.println(f1 + " : is less than f2 : " + f2 +" but , f1 is grater than f3 :" +f3);
			}
			
		} 
		else if(f1>f2)
		{
			
			
			if(f1>f3)
			{
				System.out.println("f1 : " + f1 + " , f2 : " + f2 +" , f3 : " + f3);	
				System.out.println(f1 + " : is grater than f3 : " + f3 +" and f2 :" +f2);
				
			}
			else
			{
				System.out.println("f1 : " + f1 + " , f2 : " + f2 +" , f3 : " + f3);
				System.out.println(f1 + " : is grater than f2 : " + f2 +" but f1 is less than f3 :" +f3);
			}
		}
		
		
	}
	
	public static void alphbet_vovels_check()
	{
		
		
		
		System.out.println("Enter Frirst number : ");
		char f1='d';
		if(f1=='a' || f1=='e' || f1=='i' || f1=='o' || f1=='u')
		{
			System.out.println("this is vowel");
		}
		else
		{
			System.out.println("this is consonents");
		}
		
		
	
	}
	
	
	public static void swapTwoNumbers()
	{
		int f3;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Frirst number : ");
		int f1=sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		
		System.out.println("Enter Second number : ");
		int f2=sc1.nextInt();
		
		
		System.out.println("Before Swapping First number is :" + f1);
		System.out.println("Before Swapping Second number is :" + f2);
		
		/**
		 * Swapping two numbers
		 *
		 */
		
		f3=f1;
		f1=f2;
		f2=f3;
		
		System.out.println("After Swapping First number is :" + f1);
		System.out.println("After Swapping Second number is :" + f2);
		
	}

	public static void EvenOdd()
	{
		int f3;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Frirst number : ");
		int f1=sc.nextInt();
		
		
		if(f1%2==0)
		{
			System.out.println(f1 + " : is even number");
		}
		else
		{
			System.out.println(f1 + " : is Odd number");
		}
	
	}

	public void others()
	{
	
		
		Scanner sc= new Scanner(System.in);
	//	System.out.println("Enter number");
	//	
	//	int a = sc.nextInt();
	//	
	//	Scanner sc1= new Scanner(System.in);
	//	System.out.println("Enter 2nd number");
	//	
	//	int b=sc1.nextInt();
	//	
	//	System.out.println("Multiply : " + (a*b));
	//
	//	
		 /**
	     *  example 1
	     */
		
		char ch = 'd';
	    int ascii = ch;
	    
	    // You can also cast char to int
	    int castAscii = (int) ch;
	
	    System.out.println("The ASCII value of " + ch + " is: " + ascii);
	    System.out.println("The ASCII value of " + ch + " is: " + castAscii);
	    
	    /**
	     *  example 2
	     */
	    String number = "1234";
	    int []arr = new int[number.length()];
	    System.out.println("THe asscii value of each character is: ");
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i] = number.charAt(i); 					// assign the integer value of character i.e ascii
	        System.out.print(" "+arr[i]);
	    }
	    
	}
}
