package Prac1;

/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;
		for (int i=1;i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		*/
		
		for (int i=1;i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		/*
		 * 3
		 * 6 9
		 * 12 15 18
		*/
		int k1=1;
		for (int i=1;i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(k1*3 + " ");
				k1++;
			}
			System.out.println();
		}
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *
		 
		//x for rows, y for columns, and row denotes the number of rows to print 
		int x, y, row=5; 
		//outer loop for rows 
		for(x=0; x<row; x++) 
		{ 
		//inner loop for columns 
		for(y=0; y<=x; y++) 
		{ 
		//To prints stars 
		System.out.print("* "); 
		} 
		//Cursor goes to the new line after printing each line. 
		System.out.println(); 
		} 
//		
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * *
		//outer loop for rows 
		int count=0;
		for(int i=0; i<5; i++) 
		{ 
		//inner loop for columns 
		for(int j=4-i; j>0; j--) 
		{ 
		System.out.print("  "); 
		}
		
		for(int z=0; z<=i; z++)
		{
		System.out.print("* ");
		}
		//Cursor goes to the new line after printing each line. 
		System.out.println(); 
		} 
		
	}

}

