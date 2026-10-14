class Solution {
    public boolean possible(int arr[],int day, int m , int k ){

        int count = 0;
        int NumBook = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                NumBook+= (count/k);
                count=0;
            }
        }

         NumBook+= (count/k);
        return NumBook>=m;
    }

    public int minDays(int[]  nums, int m, int k) {

        int start = nums[0];
        int end = nums[0];


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < start) {
                start = nums[i];
            }
            if (nums[i] > end) {
                end = nums[i];
            }
        }

long  val = (long )m * (long ) k;

  if(nums.length<val){
            return -1;
        }

    int ans = -1;
    while(start<=end){
        int mid = start+(end-start)/2;

    if(possible(nums,mid,m,k)){
        ans = mid;
        end = mid-1;
    }
    else{
        start = mid+1;
    }
    }

return ans;


























        
    //     int T1 = m*k;
    //     int T2 = m*k;
    //     int C1 = 0;
    //     int C2 = 0;
    //     //Even index 
    //     for(int i = 0;i<nums.length;i=i+2){
    //         if(T1 != 0){
    //             if(nums[i]>=k){
    //                 T1 -= k;
                    
    //             }
    //             else{
    //                 T1 -= nums[i];
    //             }
    //             C1 ++;
    //         }
    //     }
       
    //    if(T1 !=0){
    //     C1 = -1;
    //    }

    //    for(int i = 1;i<nums.length;i=i+2){
    //         if(T2 != 0){
    //             if(nums[i]>=k){
    //                 T2 -= k;
                    
    //             }
    //             else{
    //                 T2 -= nums[i];
    //             }
    //             C2 ++;
    //         }
    //     }
    // if(T2!=0){
    //     C2 = -1;
    // }
    
    // if(C1 ==-1 && C2 == -1){
    //     return -1;
    // }
    // else if(C1 == -1){
    //     return C2;
    // }
    // else if (C2 == -1){
    //     return C1;
    // }
     
    //  int ans = Math.min(C1,C2);
    //  return ans;

    
    }
}