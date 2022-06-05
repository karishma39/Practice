package BinarySearch;

// ceil = smallest value which is greater than the element
// return the element if present, otherwise the smallest ele above that no
public class CeilOfAnElement {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 10, 20, 30, 40, 60, 70};
        int ele = 50;

        System.out.println(findCeilElement(arr, ele)); //index of 60
        System.out.println(findCeilElement(arr, 20)); //index of 20

    }

    private static int findCeilElement(int[] arr, int ele) {
        int start = 0;
        int end = arr.length -1;
        int res = -1;

        if(ele>arr[end])
            return -1;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == ele)
                return mid;
            if(arr[mid]>ele){
                res=mid;
                end = mid -1;
            }
            if(arr[mid]<ele){
                start = mid+1;
            }
        }

        return res;
    }
}

