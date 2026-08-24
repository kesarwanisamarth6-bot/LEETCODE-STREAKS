class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right;
        int zeros = 0;
        int max = 0;

        for(right=0;right<nums.length;right++){
            //to count the zeros;
            if(nums[right]==0){
                zeros++;
            }
           
            while(zeros>k){
            if(nums[left]==0){
                zeros--;
            }
            left++;
            }
             int curr = right - left + 1;
        max = Math.max(max,curr);
        }

        return max;    
    }
}