class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int left;
        int right;
        for(int i =0;i<nums.length;i++){
            left = i-k;
            right = i+k;
            if(left<0 && nums[right]<nums[i]){
                sum=sum+nums[i];
            }
            else if ( right>nums.length-1 && nums[left]<nums[i] ){
                sum=sum+nums[i];
            }
              else if(left<0 && right >nums.length-1){
                sum=sum+nums[i];
            }
            else if ((left>=0 && right<=nums.length-1)&& (nums[i]>nums[left] && nums[i]>nums[right])){
                sum=sum+nums[i];
            }
          
    }

    return sum;

}
}
