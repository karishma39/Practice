

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySqaureAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Given an array of integers sorted in ascending order, return an array of the squares of each number sorted in ascending order.
		//		**Input**: [-2, -1, 0, 1, 2, 3]
		//		**Output**: [0, 1, 1, 4, 4, 9]

		int arr[]=new int[] {-2, -1, 0, 1, 2, 3};
		List list=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]*arr[i]);
		}
		Collections.sort(list);
		System.out.println(list);

	}

}
