class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;


        //kadane's algorithm.
        for(int i = 0;i<nums.length;i++){
            cs=cs+nums[i];
              ms= Math.max(ms,cs);
            if(cs<0){
                cs=0;    
            }

            //   ms= Math.max(ms,cs); agar isko niche likhoge tho cs agar negative hua tho wo 0 ban jayega hamesha 
        }
        return ms;
    }
    
}



// int min =  Integer.MIN_VALUE;
    // int count=0;
    //     for(int i = 0;i<nums.length;i++){
    //         if(nums[i]<0){
    //             count=count+1;
    //         }

    //         if(count==nums.length){
    //             for(int j = 0;j<nums.length;j++){
    //                 if(nums[j]>min){
    //                     min=nums[j];
    //                 }
    //             }
    //             return min;
    //         }
    //     }