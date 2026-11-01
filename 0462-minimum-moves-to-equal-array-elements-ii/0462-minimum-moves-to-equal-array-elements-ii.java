class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int midIdx = start + (end-start)/2;
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