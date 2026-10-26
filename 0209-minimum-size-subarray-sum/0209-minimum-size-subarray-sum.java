class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int size = Integer.MAX_VALUE;
        int sum = 0;
        while(j<nums.length){ 
            sum+=nums[j];
            if(sum>=target){
                while(sum>=target){
                    size = Math.min(size,j-i+1);
                    sum-=nums[i];
                    i++;
                }
            }
            j++;   
    }
    if(size == Integer.MAX_VALUE){
        return 0;
    }
    return size;
}
}