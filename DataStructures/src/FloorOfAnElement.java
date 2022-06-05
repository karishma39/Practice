package BinarySearch;

// floor = greatest value which is less than the element
// return the element if present, otherwise the greatest ele below that no
public class FloorOfAnElement {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 10, 20, 30, 40, 60, 70};
        int ele = 50;

        System.out.println(findFloorElement(arr, ele)); //index of 40
        System.out.println(findFloorElement(arr, 20)); //index of 20

    }

    private static int findFloorElement(int[] arr, int ele) {
        int start = 0;
        int end = arr.length -1;
        int res = -1;

        if(ele<arr[start])
            return res;
        else if(ele>arr[end])
            return end;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==ele)
                return mid;
            if(arr[mid]>ele){
                end = mid-1;
            }
            if(arr[mid]<ele){
                res = mid;
                start = mid+1;
            }
        }

        return res;
    }

}
