class Solution {
    public boolean isSubsequence(String s, String t) {
    //     int j=0;
    // if(s.length()==0){
    //     return true;
    // }
    
    //     int count =0;
    //     for(int i=0;i<s.length();i++){
    //         while(j<t.length()){
    //             char c = s.charAt(i);
    //             char curr = t.charAt(j);
    //             if(c==curr){
    //                 count++;
    //                 i++;
    //             }
    //             if(count==s.length()){
    //                 return true;
    //             }
    //             j++;
    //         }
    //     }
    //     return false;

    int i=0;
    int j=0;
    while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
        }
        j++;
    }
    return i==s.length();
    }
}