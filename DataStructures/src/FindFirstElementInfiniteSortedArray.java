package BinarySearch;

public class FindFirstElementInfiniteSortedArray {
    public static void main(String args[]) {
        int arr[] = new int[]{0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2}; //image it's a infinite array
        int ele = 1;

        int start = 0;
        int end = 1;
        // find end index
        while(ele>arr[end]){
            start = end;
            end = end*2;
        }
// after find start and end , do binary search
        System.out.println(findElement(arr, ele, start, end)); //index of 40
    }

    private static int findElement(int[] arr, int ele, int start, int end) {
        int res=-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(ele == arr[mid]){
                res=mid;
                end=mid-1;
            }
            if(ele>arr[mid])
                start = mid+1;
            if(ele<arr[mid])
                end=mid-1;
        }
        return res;
    }
}
