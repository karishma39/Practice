package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumFromAllSubarray {

    public static void main(String args[]){
        int k = 3;
        int nums[] = new int[]{3, -5, 2, 6, 1, -4, 2, 6, -2, -4,1, 8, 7,9};
        List<Integer> list=new ArrayList<Integer>();
        int i=0;
        int max=Integer.MIN_VALUE;
        if(k==1)
            System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++)
        {
            max=Math.max(max,nums[j]);
            if(j-i+1==k){
                list.add(max);
                if(k==2){
                    max=nums[i+1];
                }
                else if(max==nums[i]){
                    max=Integer.MIN_VALUE;
                    for(int x=i+1;x<k+i;x++){
                        max=Math.max(nums[x],max);
                    }
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(list.stream().toArray()));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);

    }
}
