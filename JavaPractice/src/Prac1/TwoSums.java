package Prac1;

import java.util.Arrays;

public class TwoSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[]{2,7,11,15};
		Solution s=new Solution();
		System.out.println(Arrays.toString(s.twoSum(arr, 9)));
	}
}
	
class Solution{  
	public int[] twoSum(int[] nums, int target) {
		
		int arr2[] = new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j] == target)
				{
					arr2[0]=i;
					arr2[1]=j;
				}
			}
			
			
		}
		return arr2;
	        
	    }
	}



