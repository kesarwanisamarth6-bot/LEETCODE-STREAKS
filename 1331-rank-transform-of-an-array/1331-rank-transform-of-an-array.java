class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int newarr[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
    HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(newarr);
        int rank=1;
        for(int j=0;j<newarr.length;j++){
           if (!map.containsKey(newarr[j])) {
                map.put(newarr[j], rank);
                rank++;
            }
        
        }

       
        for(int k=0;k<arr.length;k++){
        arr[k]=map.get(arr[k]); 
        }
        
        return arr;
        
    }
}