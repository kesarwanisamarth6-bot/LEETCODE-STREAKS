class Solution { 
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int pcount[] = new int[26];
        int scount[] = new int[26];
        int k = p.length();
        for(int i = 0;i<p.length();i++){
            char c = p.charAt(i);
            pcount[c-'a']++;
        }

        int i = 0;
        int j = 0;
        while(j<s.length()){
            char add = s.charAt(j);
            scount[add-'a']++;

            if(j-i+1<k){
                j++;
            }
            else if (j-i+1==k){
            if(Arrays.equals(scount,pcount)){
                list.add(i);
            }
            char rem = s.charAt(i);
            scount[rem-'a']--;
            i++;
            j++;
            }
        }


        return list;

























    // List<Integer> list = new ArrayList<>();
    // String str = p;
    // char [] num = str.toCharArray();
    // Arrays.sort(num);
    // String newp = new String(num);
    // int k = p.length();
    // StringBuilder  sb = new StringBuilder();
    // int i = 0;
    // int j = 0;
    // while(j<s.length()){
    //     sb.append(s.charAt(j));

    //     if(j-i+1<k){
    //     j++;
    //     }
    //     else if (j-i+1==k){
    //     char arr[] = sb.toString().toCharArray();
    //     Arrays.sort(arr);
    //     String sortedsb = new String(arr);
    //     if(sortedsb.equals(newp)){
    //         list.add(i);
    //     }
    //     sb.deleteCharAt(0);
    //     i++;
    //     j++;
    //     }
    // }
    // return list;
    }
}