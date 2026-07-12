class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        int j = 0;
        double max = Double.NEGATIVE_INFINITY;
        while(j<nums.length){
            sum = sum+nums[j];
            if(j-i+1<k){
                j++;
            }
            else {
            max = Math.max(sum,max);
            sum=sum-nums[i];
            i++;
            j++; 
            }
        }
        return max/k;
    }
}