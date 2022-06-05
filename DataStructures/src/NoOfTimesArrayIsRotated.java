package BinarySearch;

public class NoOfTimesArrayIsRotated {

    public static void main(String args[]) {
        int arr[] = new int[]{10, 10, 20, 40, 50, 60, 70, 5, 7, 8, 10, 10};
        System.out.println(noOfTimeArrayIsRotated(arr));
    }

    //find index of minimum
    private static int noOfTimeArrayIsRotated(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (arr[next] > arr[mid] && arr[mid] < arr[prev])
                return n - mid;

            else if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[end]) {
                end = mid - 1;
            }

        }
        return -1;
    }
}
