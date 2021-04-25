package Prac1;

import java.util.ArrayList;

public class Arraysex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]= new int[3];
		int arr[] = new int[]{1, 1, 2, 1};
		ArrayList list=new ArrayList();
		for(int i=1; i<=arr.length; i++)
		{
			int j;
			for(j=0;j<arr.length;j++)
			if(arr[j]==i)
			{
				break;
			}
			
			if(j==arr.length)
				list.add(i);
				
		}
		
		System.out.println(list.toString());

	}

}
