package BinarySearch;

public class SearchAnElementInBitonicArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 8, 12, 10, 4, 3, 2}; //bitonic array - only one peak
        int ele = 4;
        int peak = findPeakElement(arr);
        if (arr[peak] == ele)
            System.out.println(peak);
        else {
            int index1 = findElementBS(arr, 0, peak - 1, ele);
            int index2 = findElementBSReverse(arr, peak + 1, arr.length - 1, ele);
            if (index1 != -1) {
                System.out.println(index1);
            } else if (index2 != -1) {
                System.out.println(index2);
            } else {
                System.out.println(-1);
            }
        }
    }

    private static int findElementBSReverse(int[] arr, int start, int end, int ele) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == ele) {
                return mid;
            } else if (arr[mid] < ele) {
                end=mid-1;
            } else if (arr[mid] > ele) {
                start=mid+1;
            }
        }
        return -1;
    }

    private static int findPeakElement(int[] arr) {
        int start = 1;
        int end = arr.length - 2;
        if (arr[0] > arr[1])
            return 0;
        else if (arr[arr.length - 1] > arr[arr.length - 1])
            return arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1]) {
                return mid;
            }
            if (arr[mid - 1] == arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int findElementBS(int[] arr, int start, int end, int ele) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == ele) {
                return mid;
            } else if (arr[mid] < ele) {
                start = mid + 1;
            } else if (arr[mid] > ele) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
