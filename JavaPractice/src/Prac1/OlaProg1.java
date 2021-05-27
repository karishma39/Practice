package Prac1;

import java.util.Arrays;

public class OlaProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		{80,90,2,3}
//		I should get minimum postive number
//		1
//		{-1,0,1,3,4}
//		2
//		{-1,1}
		//2
//		{1,2,3,4,5}
//		6
		
		int arr[]=new int[] {1,3,2};
		Arrays.sort(arr);
		int k=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				k++;
			}
		}
			System.out.println(k);

	}

}
