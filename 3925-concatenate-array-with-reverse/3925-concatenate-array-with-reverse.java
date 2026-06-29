class Solution {
    public int[] concatWithReverse(int[] nums) {
    int arr[]= new int[nums.length*2];
    Stack<Integer> s = new Stack<>();
    int i;
    for(i =0;i<nums.length;i++){
        arr[i]=nums[i];
        s.push(nums[i]);
    }
        while(!s.isEmpty()){
            int n = s.pop();
            arr[i]=n;
            i++;
        }
        return arr;
    }
}