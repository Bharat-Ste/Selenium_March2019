package others_prectice;

import java.util.Scanner;
/*
	Enter the number of rows to print the pattern 
	5
	** Printing the pattern... **
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
 */

public class pattern_one {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /*
         * ** Printing the pattern... **
			1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
         * */
        
        
        System.out.println("Enter the number of rows to print the pattern ");

        int rows1 = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int k = rows1; k >= 1; k--)
        {
            for (int l = k; l >= 1; l--)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        /*
         ** Printing the pattern... **
			5 4 3 2 1 
			4 3 2 1 
			3 2 1 
			2 1 
			1 
	    **/ 
        

	}

}
