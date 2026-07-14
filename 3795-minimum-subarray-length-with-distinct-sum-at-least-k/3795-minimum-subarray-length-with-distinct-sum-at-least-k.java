class Solution {
    public int minLength(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int i =0;
        int j =0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j<nums.length){
            if(map.getOrDefault(nums[j],0)==0){
                sum+=nums[j];
            }
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(sum<k){
                j++;
            }
           else if (sum>=k){
             while(sum>=k){
                min = Math.min(min,j-i+1);
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    sum-=nums[i];
                    map.remove(nums[i]);
                }
                i++;
             }
            j++;
        }
        }
        return min == Integer.MAX_VALUE?-1:min;
            
        
}
}