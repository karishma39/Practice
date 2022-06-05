package BinarySearch;

// peak elements is greater than it's neighbours, it can the last element is it's greater tha size-1, it can be first[0] element if it's greater than ele at index 1.
public class FindPeakElementInUnsortedArray {

    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,1}; //peak = 2,3,4 return qny one
        int[] arr2 = new int[]{1,3,6,4,5,10,20,30,40,50,60}; //peak = 6,60
        int[] arr3 = new int[]{1,2,1,2,1};
        int[] arr4 = new int[]{1,3,8,12,4,2}; //bitonic array - only one peak
        System.out.println(findPeakElement(arr1));
        System.out.println(findPeakElement(arr2));
        System.out.println(findPeakElement(arr3));
        System.out.println(findPeakElement(arr4));
    }

    private static int findPeakElement(int[] arr) {
        if(arr[0]>arr[1])
        {
            return 0;
        }
        if(arr[arr.length -1]>arr[arr.length -2]){
            return arr.length-1;
        }
        int start = 1;
        int end = arr.length -2;
        while(start<=end){
            int mid=start + (end - start)/2;
            if(arr[mid-1]<=arr[mid] && arr[mid]>=arr[mid+1]){
                return mid;
            }
            if(arr[mid-1]==arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                end=mid-1;
            }
            else if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }

        }
        return -1;
    }
}
