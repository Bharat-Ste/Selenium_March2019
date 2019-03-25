package javaSessions;

public class assignment_Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		loop_prectice();
//		CricketPlayers();
//		Pattern_test();
		loop();

	}
	
/*
 * Question 1: Write a program to print the following pattern using for loop:


			00 01 02 03 04 05 06 07 08 09 
			
			10 11 12 13 14 15 16 17 18 19 
			
			20 21 22 23 24 25 26 27 28 29 
			
			30 31 32 33 34 35 36 37 38 39 
			
 * 	
 */
	
    public static void loop_prectice()
	{
		
		for(int i=0;i<40;i++)
		{
			if(i<=9)
			{
			System.out.print("0"+ i + " ");
				if(i==9)
				{
					System.out.println();
				}
			}
			else if(i>9 & i<20)
			{
				
				System.out.print(i + " ");
				if(i==19)
				{
					System.out.println();
				}
				
			}
			else if(i>19 & i<=29)
			{
				
				System.out.print(i + " ");
				if(i==29)
				{
					System.out.println();
				}
			}
			else if(i>29 & i<=39)
			{
				
				System.out.print(i + " ");
				if(i==39)
				{
					System.out.println();
				}
			}
	
		}
	}
   

    public static void loop()
    {
    	for(int i=0;i<5;i++)
    	{
    		for(int j=0;j<10;j++)
    		{
    			System.out.print(i +""+ j + " ");
    		}
    		System.out.println();
    	}
    	
    }
    
    
    
/*	 
 * Question 2: Write a program to create a static Array, having following cricket data:
			
			--name, age, team name, DOB, gender, Strike Rate
			
			--Try to create multiple Object Arrays for different players 
			
			--Try to print all the values of each player on the console
 * */
	
	public static void CricketPlayers()
	{
		Object[] name = new Object[4];
		Object[] age = new Object[4];
		Object[] teamName= new Object[4];
		Object[] DOB= new Object[4];
		Object[] gender= new Object[4];
		Object[] Strike_Rate= new Object[4];
		
		
		name[0]="sachin";
		name[1]="Mahinder";
		name[2]="Virat";
		name[3]="Ravi";
		
		
		age[0]="40";
		age[1]="38";
		age[2]="54";
		age[3]="56";
		
		
		teamName[0]="Kigns 11";
		teamName[1]="Knight Riders";
		teamName[2]="Chennai";
		teamName[3]="NA";
		
		DOB[0]="15 sep";
		DOB[1]="30 Oct";
		DOB[2]="16 nov";
		DOB[3]="1 Jan";
		
		
		gender[0]="Male";
		gender[1]="Male";
		gender[2]="Male";
		gender[3]="Male";
		
		Strike_Rate[0]="60%";
		Strike_Rate[1]="78%";
		Strike_Rate[2]="85%";
		Strike_Rate[3]="50%";
		
		System.out.println("--------------------------------------------------------------");
		System.out.println(" Name    "  + " AGE    "  + " Team Name    " + " DOB    " + " Gender   " + " Strike_Rate   ");
		System.out.println("--------------------------------------------------------------");
		for(int i= 0; i< name.length ; i++)
		{
			
			System.out.println(name[i] + " --  " + age[i] + " --  " + teamName[i] + " --  " + DOB[i] + " --  " + gender[i] + " --  " + Strike_Rate[i]);
		} 
		System.out.println("--------------------------------------------------------------");
		
		
	}

/*
 * 
 * Question 3: Try to print the following pattern on the console:
			
			n = 4
			
			n = 3
			
			n = 2
			
			n = 1
			
			n = 0
 * */	
	
	public static void Pattern_test()
	{
		
		
		for(int k=4;k>=0 ;k--)
		{
			System.out.println(" n = " + k);
		}
	}
	

}
