class Solution {
    public int mySqrt(int x) {
        
    // int ans = 1;
    // for(int i = 0;i<=x;i++){
    //     if(i*i<=x){
    //         ans = i;
    //     }
    //     else{
    //         break;
    //     }
    // }
    // return ans;


    int start = 0;
    int end = x;
    while(start<=end){
         long mid = start + (end-start)/2 ;
        long val = mid*mid;
        if(val>x){
            end =(int) mid-1;
        }
        else if(val<=x){
            start = (int)mid+1;
        }
    }
    return end;
    }
}