package BinarySearch;

public class FindelementInRotatedArray {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 10, 20, 30, 40, 50, 60, 70, 5, 7, 8, 10, 10};
        int minIndex= IndexOfMinElement(arr);
        int ele = 7;
        if(ele<arr[arr.length -1]){
            System.out.println(findElement(arr, minIndex, arr.length -1 , ele));
        }
        else{
            System.out.println(findElement(arr, 0, minIndex -1, ele));
        }
    }

    private static int findElement(int[] arr, int start, int end, int ele) {
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                start=mid+1;
            }
            else if(arr[mid]>ele)
                end = mid -1;
        }
        return -1;
    }

    //find index of minimum
    private static int IndexOfMinElement(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (arr[next] > arr[mid] && arr[mid] < arr[prev])
                return mid;

            else if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[end]) {
                end = mid - 1;
            }

        }
        return -1;
    }
}
