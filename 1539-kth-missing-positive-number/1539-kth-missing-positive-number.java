class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=1000 + k;i++){
        if(!(set.contains(i))){
            list.add(i);
        }
        }  
    
    return list.get(k-1);
        
    }
}