package BinarySearch;

public class FindMinDifference {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 10, 20, 30, 40, 60, 70, 80, 90, 100}; //image it's a infinite array
        int ele = 52;

        System.out.println(findMinDiff(arr, ele));
    }

    public static int findMinDiff(int[] arr, int ele){
        int start=0;
        int end=arr.length;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==ele){
                return mid;
            }
            if(arr[mid]<ele)
                start=mid+1;
            if(arr[mid]>ele)
                end=mid-1;
        }
        int floor = Math.abs(ele - start);
        int ceil = Math.abs(end - ele);

        if(floor<ceil)
            return start;
        else
            return ceil;
    }
}
