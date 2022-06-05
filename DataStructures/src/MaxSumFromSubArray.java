package slidingWindow;

public class MaxSumFromSubArray {

    public static void main(String args[]) {
        int windowSize = 3;
        int arr[] = new int[]{3, 5, 2, 6, 1, 4, 2, 6, 2};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (j - i + 1 == windowSize) {
                max = Integer.max(sum, max);
                sum = sum - arr[i];
                i++;
            }
        }
        System.out.println(max);
    }
}
