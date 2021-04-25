package Prac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution1 s=new Solution1();
		System.out.println(s.threeSum(new int[]{3,0,-2,-1,1,2}).toString());
	}

}

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
    	
    	Set<List<Integer>> set= new HashSet<List<Integer>>();
    	for(int i=0;i<nums.length;i++)
    	{
    		for(int j=i+1;j<nums.length;j++)
    		{
    			for(int k=j+1;k<nums.length;k++)
    			{
    				List list1=new ArrayList();
    				if(nums[i]+nums[j]+nums[k] == 0)
    				{
    					list1.add(nums[i]);
    					list1.add(nums[j]);
    					list1.add(nums[k]);
    				
    					Collections.sort(list1);
    					set.add(list1);
    				}	
    			}
    		}
    		
    	}
    	List<List<Integer>> mainList = new ArrayList<List<Integer>>(set);
    	return mainList;
        
    }
}

