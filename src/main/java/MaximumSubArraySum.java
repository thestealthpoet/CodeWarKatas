public class MaximumSubArraySum {
    public static int sequence(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];

            }
        }
        return sum;
    }
}
