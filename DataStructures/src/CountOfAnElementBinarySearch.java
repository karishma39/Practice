package BinarySearch;

public class CountOfAnElementBinarySearch {

    public static void main(String args[]){
        int arr[]=new int[]{5,7, 8,10,10,10,10,10, 40,50,60,70};
        System.out.println("count of element: 1 "+lastOccurence(arr,10));
        System.out.println("count of element: 2 "+firstOccurence(arr,10));
        System.out.println("count of element: "+ (lastOccurence(arr,10)- firstOccurence(arr,10) +1));
        System.out.println("count of element: ");
    }

    private static int firstOccurence(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;
        int res=0;
       while(start<=end) {
           int mid=start + (end -start)/2;
           if (i == arr[mid]) {
               res = mid;
               end = mid - 1;
           } else if (i < arr[mid]) {
               end = mid - 1;
           } else if (i > arr[mid]) {
               start = mid + 1;
           }
       }
        return res;
    }

    private static int lastOccurence(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;
        int res=0;
        while(start<=end) {
            int mid=start + (end -start)/2;
            if (i == arr[mid]) {
                res = mid;
                start = mid + 1;
            } else if (i < arr[mid]) {
                end = mid - 1;
            } else if (i > arr[mid]) {
                start = mid + 1;
            }
        }
        return res;
    }
}
