class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        int j = 0;
        double ans; 
        /
        double max = Double.NEGATIVE_INFINITY;
        while(j<nums.length){
            sum = sum+nums[j];
            if(j-i+1<k){
                j++;
            }
            else {
            ans = (double)sum/k;
            max = Math.max(ans,max);
            sum=sum-nums[i];
            i++;
            j++; 
            }
        }
        return max;
    }
}