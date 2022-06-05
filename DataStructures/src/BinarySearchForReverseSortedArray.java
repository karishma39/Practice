public class BinarySearchForReverseSortedArray {
    public static void main(String args[]){
        int arr[]=new int[]{70,60,50,40,30,20,10};

        System.out.println(searchElement(arr,60)); //returns 1
        System.out.println(searchElement(arr,15)); //returns -1
        System.out.println(searchElement(arr,40)); //returns 3
        System.out.println(searchElement(arr,20)); //returns 5

    }

    private static int searchElement(int[] arr,int ele) {
        int start=0;
        int end=arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2; //writing like this to stop int overflow
            if(ele==arr[mid]){
                return mid;
            }
            else if(ele<arr[mid]){
                start=mid+1;
            }
            else if(ele>arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
}

