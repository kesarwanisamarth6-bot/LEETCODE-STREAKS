class Solution {
    public int findPeakElement(int[] nums) {

        if(nums.length==1){
             return 0;        
          }
         if(nums[0]>nums[1]){
            return 0;
          }
         if(nums[nums.length-2] < nums[nums.length-1]){
            return nums.length-1;
          }


             int start = 1;
             int end = nums.length-2;

            while(start<=end){
                 int mid = start + (end-start)/2;
                 if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                 }
                 if(nums[mid]>nums[mid-1]){
                    start= mid+1;
                 }
                 else{
                    end = mid-1;
                 }
            }
        return -1;
    }
    
}



        // if (nums.length == 1) {
        //     return 0;
        // }

        // for(int i = 0 ;i<nums.length;i++){
 
        //     if(i==0 && nums[i]>nums[i+1]){
        //          return i;
        //     }
        //      else if(i==nums.length-1 && nums[i]>nums[i-1]){
        //          return i;
        //     }

        //      else if( i > 0 && i < nums.length - 1 && nums[i]>nums[i+1] && nums[i-1]<nums[i]){
        //          return i;
        //     }
        // }
        //      return 0;
