class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    Deque<Integer> q = new LinkedList<>();
    int n = nums.length;
    int j = 0;
    int max = Integer.MIN_VALUE;
    int i =0;
    int idx = 0;
    int[] arr = new int[n - k + 1];

    while(j<n){
       
            while (!q.isEmpty() && q.peekLast() < nums[j]) {
                q.pollLast();
            }

            q.addLast(nums[j]);

       if(j-i+1<k){
        j++;
       }
       else{
        arr[idx++]= q.peekFirst();
          if (nums[i] == q.peekFirst()) {
                    q.pollFirst();
                }
        i++;
        j++;
       }
     
    }
return arr;
   
    }
}