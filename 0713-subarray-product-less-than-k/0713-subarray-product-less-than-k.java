class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     int i =0;
     int j =0;
     long m = 1;
     int count = 0;
     if(k<=1){
        return 0;
     }
     while(j<nums.length){
        m = m * nums[j];
        // if(m<k){
        //     count+=j-i+1;
        // }
        // else{
        //     while(m>=k){
        //         m=m/nums[i]; 

        //         i++;
        //         if(m<k){
        //             count +=j-i+1;
        //         }
        //     }    

        while(m>=k){
            m = m/nums[i];
            i++;
        }    
        count+=j-i+1;
        j++;
     }   
     return count;
    }
}