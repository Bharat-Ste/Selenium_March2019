package others_prectice;

public class TwoDimentionalArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		TwoDimArray();

	}
	public static void TwoDimArray()
	{
	  Integer arr[][]=new Integer[20][10];
	  
	  for(int i=0;i<20;i++)
	  {
		  for(int j=0;j<10;j++)
		  {
			  arr[i][j]=i+j;
			  
		  }
	  }
	  System.out.println(arr[1][1]);
	  
	  // Print 2D array Values
	  // value on arr[0][1] is : 1
	  
	  for(int k=0;k<20;k++)
	  {
		  
		  for(int l=0;l<10;l++)
		  {
			  System.out.println("value on arr["+ k + "]" +"["+l+ "] is :" + arr[k][l] +"  ");
//			  System.out.print("[" + arr[k][l] + "]" );
		  }
		  
		  System.out.println();
	  }
		
	}
}
