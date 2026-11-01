class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int midIdx = 0 + (nums.length-1-0)/2;
        int minVal = nums[midIdx];

        int i = 0;
        int j = nums.length-1;
        int count=0;

        while(!(i==midIdx && j==midIdx)){
            if(i<midIdx){
            count += Math.abs(nums[i]-minVal);
             i++;
            }
            if(j>midIdx){
            count += Math.abs(nums[j]-minVal);
            j--;
            }
        }
        return count;
    }
}