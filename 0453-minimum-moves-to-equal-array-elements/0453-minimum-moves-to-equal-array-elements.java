class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            min = Math.min(nums[i],min);
        }
        int count = 0;
        for(int j = 0;j<n;j++){
            count+= Math.abs(nums[j]-min);
        }
        return count;
        
    }
}