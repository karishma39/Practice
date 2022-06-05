package BinarySearch;

public class FindNextAlphabet {
    public static void main(String args[]) {
        char arr[] = new char[]{'a', 'c', 'e', 'f', 's', 'u'};
        char ele = 'f';

        System.out.println(findCeilElement(arr, ele)); //index of s
        System.out.println(findCeilElement(arr, 'c')); //index of e

    }

    private static int findCeilElement(char[] arr, char ele) {
        int start = 0;
        int end = arr.length -1;
        int res = -1;

        if(ele>arr[end])
            return -1;

        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == ele)
                start=mid-1;
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
