class Solution {
    public void solve(int arr[],int i ,List<List<Integer>>ans, List<Integer>path){
        if(i==arr.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        List<Integer> path1 = new ArrayList<>(path);
        List<Integer> path2 = new ArrayList<>(path);
        path2.add(arr[i]);
        solve(arr,i+1,ans,path1);
        solve(arr,i+1,ans,path2);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int i = 0;
        solve(nums,i,ans,path);
        return ans;
    }
}