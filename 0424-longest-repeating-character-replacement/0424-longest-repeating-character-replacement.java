class Solution {
    public int characterReplacement(String s, int k) {
    HashMap<Character,Integer> map = new HashMap<>();
    int i = 0;
    int j = 0;
    int max = 0;
    while(j<s.length()){
        char c = s.charAt(j);
        map.put(c,map.getOrDefault(c,0)+1);
        int maxFreq = Collections.max(map.values());
        int replace = (j-i+1) - maxFreq;
        if(replace<=k){
            max = Math.max(j-i+1,max);
            j++;
        }
        else {
            while(replace>k){
                char rem = s.charAt(i);
                map.put(rem,map.get(rem)-1);
                if(map.get(rem)==0){
                    map.remove(rem);
                }
                i++;
               maxFreq = Collections.max(map.values());
               replace = (j-i+1) - maxFreq;
            }
            j++;
        }
    
    }
    return max;
    }
}