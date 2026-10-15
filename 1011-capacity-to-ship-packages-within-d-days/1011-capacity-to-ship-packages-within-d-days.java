class Solution {

    public boolean check(int nums[],int maxWe,int days){

        int currday = 0;
        int sum = 0;
      
        for(int i = 0;i<nums.length;i++){
            if(sum + nums[i] >maxWe){
                currday++;
                sum = nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
         return currday+1<=days;


    }
    public int shipWithinDays(int[] nums, int days) {
        int max = nums[0];
        int sum = 0;
        int ans = -1;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            sum+=nums[i];
        }
        int start = max;
        int end = sum;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(check(nums,mid,days)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }

}