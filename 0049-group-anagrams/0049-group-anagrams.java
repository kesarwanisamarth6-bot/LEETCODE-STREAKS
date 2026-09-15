class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        int j = 0;
        for(int i = 0;i<strs.length;i++){
        char[] arr = strs[i].toCharArray();
        Arrays.sort(arr);
        String s = new String(arr);
        if(!(map.containsKey(s))){
            list.add(new ArrayList<>());
            map.put(s,j);
            list.get(j).add(strs[i]);
            j++;
        }
        else{
            int k = map.get(s);
            list.get(k).add(strs[i]);
        }
        
        }
        return list;
    }
}