class Solution {
    public int countSubarrays(int[] nums, int maxSum) {
        int subarrays = 1;
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= maxSum) {
                sum += nums[i];
            } else {
                subarrays++;
                sum = nums[i];
            }
        }

        return subarrays;
    }

    public int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        int start = max;
        int end = sum;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int subarrays = countSubarrays(nums, mid);

            if (subarrays > k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}