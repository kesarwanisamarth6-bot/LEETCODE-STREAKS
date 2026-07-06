class Solution {
    public int index(String s){
         int i = s.length()-1;
        while(i>=0){
            char c = s.charAt(i);
            if(c=='a' || c=='e'||c=='i'|| c=='o'|| c=='u'){
                i--;
            }
            else{
            return i;
            }
        }
        return -1;
  }
    public String trimTrailingVowels(String s) {
       int idx = index(s);
        if(idx!=s.length()-1){
            return s.substring(0,idx+1);
        }
        return s;
    }
}