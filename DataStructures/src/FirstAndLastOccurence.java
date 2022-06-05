package BinarySearch;

public class FirstAndLastOccurence {
    public static void main(String args[]){
        int arr[]=new int[]{5,7, 8,10,10,20,10,60,70};

        System.out.println(firstOccurence(arr,10)); //returns 3
        System.out.println(lastOccurence(arr,10)); //returns 6
        System.out.println(lastOccurence(arr,15)); //returns -1

    }

    private static int lastOccurence(int[] arr, int ele) {
        int start=0;
        int res=0;
        int end=arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2; //writing like this to stop int overflow
            if(ele==arr[mid]){
                res=mid;
                start=mid+1;
            }
            else if(ele<arr[mid]){
                end=mid-1;
            }
            else if(ele>arr[mid]){
                start=mid+1;
            }
        }
        if(res==0)
            return -1;
        else
            return res;
    }

    private static int firstOccurence(int[] arr,int ele) {
        int start=0;
        int res=0;
        int end=arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2; //writing like this to stop int overflow
            if(ele==arr[mid]){
                res=mid;
                end=mid-1;
            }
            else if(ele<arr[mid]){
                end=mid-1;
            }
            else if(ele>arr[mid]){
                start=mid+1;
            }
        }
        if(res==0)
            return -1;
        else
            return res;
    }
}
