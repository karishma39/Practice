package Prac1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ZerosAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nos[]= new int[] {2,0,5,7,0,0,8,0,9};
		int[] resultarray=new int[nos.length];
		int k=0;
		for(int i=0;i<nos.length; i++)
		{
			if(nos[i]!=0)
				resultarray[k++]=nos[i];
		}
		for(int i=k;i<nos.length;i++)
		{
			resultarray[k]=0;
		}
		System.out.println("first approach"+ Arrays.toString(resultarray));
		int[] arr1 = IntStream.range(0, nos.length).filter(i -> nos[i]!=0).map(i -> nos[i]).toArray();
		int[] newarr = new int[nos.length]; 
				System.arraycopy(arr1, 0, newarr, 0, arr1.length);
				System.out.println(Arrays.toString(arr1));
		for(int i=arr1.length;i<nos.length;i++)
		{
			newarr[i]=0;
		}
		System.out.println("second approach"+Arrays.toString(newarr));

	}

}
