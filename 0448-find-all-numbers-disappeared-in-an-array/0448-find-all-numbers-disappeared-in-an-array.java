class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     ArrayList<Integer>list = new ArrayList<>();
     int n = nums.length;
     HashSet<Integer> map = new HashSet<>();
     for(int i =0;i<nums.length;i++){
        map.add(nums[i]);
     }

     for(int i =1;i<=n;i++){
       if(!map.contains(i)){
        list.add(i);
       }
     }
     Collections.reverse(list);
     return list;
    }
}