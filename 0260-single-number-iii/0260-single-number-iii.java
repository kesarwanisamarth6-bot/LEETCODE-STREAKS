class Solution {
    public int[] singleNumber(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int arr[]= new int[2];
    for(int i =0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    int j=0;
    for(Integer key: map.keySet()){
        if(map.get(key)==1){
            arr[j]=key;
            j++;
        }
    }
    return arr;
    }
}