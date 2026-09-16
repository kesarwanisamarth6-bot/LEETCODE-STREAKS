class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int s1count[]= new int[26];
    int s2count[]= new int [26];
    int k = s1.length();
    for(int i = 0;i<s1.length();i++){
        char c= s1.charAt(i);
        s1count[c-'a']++;
    }
    int i = 0;
    int j = 0;
    while(j<s2.length()){
        char s = s2.charAt(j);
        s2count[s-'a']++;
        if(j-i+1<k){
            j++;
        }
        else if(j-i+1==k){
        if(Arrays.equals(s1count,s2count)){
            return true;
        }
        char rem = s2.charAt(i);
        s2count[rem-'a']--;
        i++;
        j++;
        }
    }
    return false;
    }
}