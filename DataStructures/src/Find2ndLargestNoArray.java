

public class Find2ndLargestNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,3,2, 9, 6, 8};
		int first = arr[0];
		int second = arr[2];
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
			{
				second=arr[i];
			}
		}
		
		System.out.println(second);

	}

}
