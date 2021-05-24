package Prac1;
import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {11,2,6,4,7,5,45,37};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}


}
