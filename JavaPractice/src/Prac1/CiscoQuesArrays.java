package Prac1;

public class CiscoQuesArrays {

	//Find min number in 3*3 matrix and the max no from the col in which it is present..//
	
	/*
	 * 2 11 5
	 * 3 4 7
	 * 9 2 1    min=0 max no in col=7
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= { {2,11,5}, {3,4,7}, {9,2,1}};
		
		int min=arr[0][0], col=0, max=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
					col=j;
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			if(arr[i][col]>max)
				max=arr[i][col];
		}

		System.out.println("min "+min+" "+"max "+max);
	}

}
