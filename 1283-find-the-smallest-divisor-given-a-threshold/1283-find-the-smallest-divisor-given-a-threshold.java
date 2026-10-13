class Solution {

    public boolean check(int[] nums, int mid , int threshold){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+= (nums[i] + mid - 1) / mid;
        }
        if(sum>threshold){
            return false;
        }
        return true;
    }

    public int smallestDivisor(int[] nums, int threshold) {
    
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        int start = 1;
        int end = max;
        int minInt = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
        
            if(check(nums,mid,threshold)){
             minInt = mid;
             end = mid-1;
            }

            else{
                start = mid +1;
            }
        
        }
return start;
    }
}