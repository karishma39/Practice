package Prac1;

public class ArrayFirstDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {1,3,5,4,3,7};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("First duplicate element "+ arr[i]);
					//System.out.println("apple".compareTo("banana"));
					break;
				}
			}
		}
	}

}
