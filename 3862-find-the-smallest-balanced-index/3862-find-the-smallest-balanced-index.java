// class Solution {
//     public long sum(long prefix[],int i){
    //    if(i==0){
    //        return 0;
    //    }
    //     return prefix[i-1];
    // }
    
    // public long product(int nums[],int i,long prefix[]){
    //         long product=1;
    //     if(i==nums.length-1){
    //         return 1;
    //     }
    //     long s = sum(prefix,i);
    //     for(int j=i+1;j<nums.length;j++){
    //         product*=nums[j];
    //         if(product>s){
    //             return -1;
    //         }
    //     }
    //     return product;
    // }
    
    // public int smallestBalancedIndex(int[] nums) {
    //      long[] prefix = new long[nums.length];
    //     prefix[0] = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         prefix[i] = prefix[i - 1] + (long)nums[i];
    //     }
        
    //     for(int i = 0;i<nums.length;i++){
    //         long sum = sum(prefix,i);
    //         long product = product(nums,i,prefix);
    //         if(sum==product){
    //             return i;
                
    //         }
    //     }
    //     return -1;
    class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        long totalSum = prefix[n - 1];

        long[] suffix = new long[n + 1];
        suffix[n] = 1; // empty product

        for (int i = n - 1; i >= 0; i--) {
            long next = suffix[i + 1];

            // Cap values to avoid overflow
            if (next > totalSum) {
                suffix[i] = totalSum + 1;
            } else if (next > totalSum / nums[i]) {
                suffix[i] = totalSum + 1;
            } else {
                suffix[i] = next * nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            long leftSum = (i == 0) ? 0 : prefix[i - 1];
            long rightProduct = suffix[i + 1];

            if (leftSum == rightProduct) {
                return i;
            }
        }

        return -1;
    }

    }
    