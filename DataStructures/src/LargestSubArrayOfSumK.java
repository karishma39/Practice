package slidingWindow;

// works only if numbers are positive

public class LargestSubArrayOfSumK {
    public static void main(String args[]) {
        int arr[] = new int[]{3, 5, 2, 6, 1, 4,2,3,1,0,1,1, 5, 2, 6, 2};
        int k = 10;
        int sum = 0;
        int i = 0;
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (sum < k) {
                sum += arr[j];
            }
            if (sum == k) {
                max = Math.max(j - i + 1, max);
                sum-=arr[i];
                i++;
            }
            while (sum > k) {
                sum -= arr[i];
                i++;
            }
        }
        System.out.println(max);
    }
}
