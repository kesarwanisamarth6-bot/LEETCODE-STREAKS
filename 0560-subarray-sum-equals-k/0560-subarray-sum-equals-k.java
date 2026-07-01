class Solution {
    public int subarraySum(int[] nums, int k) {
       int count=0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(n==k){
                count++;
            }
            
            for(int j = i+1;j<nums.length;j++){
            n=n+nums[j];
            if(n==k){
                count++;
            }
            }
        }
        return count;
    }
}