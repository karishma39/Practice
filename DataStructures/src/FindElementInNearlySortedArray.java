package BinarySearch;

//nearly sorted where an element is placed at i+1 or i-1 position instead of i

public class FindElementInNearlySortedArray {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 10, 20, 30, 40, 60, 50, 70};
        int ele = 50;

        System.out.println(findElement(arr, ele));
    }

    private static int findElement(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==ele)
                return mid;
            else if(mid -1 >= start && arr[mid -1]==ele)
                return mid-1;
            else if(mid +1 <= end && arr[mid +1]==ele)
                return mid+1;
            else if(ele<arr[mid]){
                end = mid-2;
            }
            else if(ele>arr[mid]){
                start=mid+2;
            }
        }
        return -1;
    }
}
