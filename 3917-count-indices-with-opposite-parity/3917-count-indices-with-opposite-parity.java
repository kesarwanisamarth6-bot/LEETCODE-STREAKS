class Solution {
    public int[] countOppositeParity(int[] nums) {
        // String ans;
        // int count;
        // for(int i =0;i<nums.length;i++){
        //  if(nums[i]%2==0){
        //      ans = "even";
        //  }
        //     else{
        //         ans = "odd";
        //     }
        //     count = 0;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(ans.equals("odd")){
        //             int n = nums[j];
        //             if(n%2==0){
        //                 count++;
        //             }
        //         }
        //         else {
        //             int n = nums[j];
        //             if(n%2!=0){
        //                 count++;
        //             }
        //         } 
        //     }
        //     nums[i]=count;
        // }
        // return nums;

        int odd = 0;
        int even = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2!=0){
                    nums[i]=even;
                    odd--;
                }
                else{
                    nums[i]=odd;
                    even--;
                }
            }
        
        return nums;
    }
}