class Solution {

    public int dominant(int suffix[],int nums[]){
        int i =0;
        int count=0;
        int n = suffix.length-1;
        while(i!=suffix.length-1){
            int sum = suffix[i+1];
            int x = n-i;
            int avg = (int)sum/x;
            if(nums[i]>avg){
                count++;
                
            }
            i++;
        }
        return count;
    }
    public int dominantIndices(int[] nums) {
        int n = nums.length;

        int[] suffix = new int[n];

        suffix[n - 1] = nums[n - 1];
    
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i] + suffix[i + 1];
        }
    return  dominant(suffix,nums);
            
    }
    
}