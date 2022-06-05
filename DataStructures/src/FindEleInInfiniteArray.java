package BinarySearch;

public class FindEleInInfiniteArray {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 10, 20, 30, 40, 60, 70, 80, 90, 100}; //image it's a infinite array
        int ele = 40;

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
       while(start<=end){
           int mid= start + (end - start)/2;
           if(arr[mid]==ele)
               return mid;
           else if(arr[mid]>ele)
               end = mid -1;
           else if(arr[mid]<ele)
               start = mid+1;
       }
       return -1;
    }
}
