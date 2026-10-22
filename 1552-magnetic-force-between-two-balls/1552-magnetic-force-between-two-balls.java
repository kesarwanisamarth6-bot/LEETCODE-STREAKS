class Solution {

    public boolean check(int position[] ,int mid, int m ){
        int countm = 1;
        int last = position[0];
        for(int i = 1;i<position.length;i++){
            if(position[i]-last>=mid){
                countm++;
                last = position[i];
            }
        }
        return countm>=m;
    }
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int start = 1;
        int end = position[n-1] - position[0];
        int ans = -1;
        if(m==2){
            return end;
        }
        while(start<=end){
            int mid = start + (end-start)/2;

            if(check(position,mid,m)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}