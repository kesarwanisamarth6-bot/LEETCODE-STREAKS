class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // int k = set.size();
        // HashMap<Integer,Integer> map = new HashMap<>();
        
        // int i = 0;
        // int j = 0;
        // int count = 0;
        // while(j<nums.length){
        //     map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        //     if(map.size()<k){
        //         j++;
        //     }
        //     else if (map.size()==k){
        //         while (map.size() == k) {

        //             count++;

        //             int x = nums[i];

        //             if (map.get(x) > 1) {
        //                 map.put(x, map.get(x) - 1);
        //             } 
        //             else {
        //                 map.remove(x);
        //             }

        //             i++;
        //         }
               

        //         j++;
        //     }
        // }
        // return count;
        int d = (int)Arrays.stream(nums).distinct().count();
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans  = 0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.size()==d){
                ans+= nums.length-j;
                int remove = nums[i];
                map.put(remove,map.get(remove)-1);
                if(map.get(remove)==0){
                    map.remove(remove);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}