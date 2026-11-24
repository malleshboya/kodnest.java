public class MaxSumSubarray {

    public static int findMaxSumSubArray(int[] arr, int k) {
        if (arr == null || arr.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int windowSum = 0;

        // Step 1: Compute sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window from index k to the end
        for (int i = k; i < arr.length; i++) {
            // Add incoming element, subtract outgoing element
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = findMaxSumSubArray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
        // Output: Maximum sum of subarray of size 3 is: 9
    }
}