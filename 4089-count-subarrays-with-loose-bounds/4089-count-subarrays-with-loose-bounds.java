class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        int i = 0;
        int j = 0;
        long count = 0;

        while (j < nums.length) {

            if (nums[j] >= minK && nums[j] <= maxK) {
                count += j - i + 1;
                j++;
            } else {
                i = j + 1;
                j++;
            }
        }

        return count;
    }
}
