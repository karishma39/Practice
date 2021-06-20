

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(4);
		arr.add(5);
		arr.add(6);
		// 4+5+6 + (5,6) + (4,5) + (4 + 5 + 6)
		long sum=0; long temp=0;
	    
	    for(int i=0;i<arr.size();i++)
	    {
	        temp=0;
	        for(int j=i;j<arr.size();j++)
	        {
	            temp=temp + arr.get(j);  // 4, 4+5, 4+5+6 -> 5, 5+6 -> 6
	            sum+=temp;
	        }
	    }
	    System.out.println(sum);

	}

}
