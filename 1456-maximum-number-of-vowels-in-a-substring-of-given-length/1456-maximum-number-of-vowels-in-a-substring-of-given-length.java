class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int count =0;
        while(j<s.length()){
            char c = s.charAt(j);
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
            if(j-i+1<k){
                j++;
            }
            else{
                max = Math.max(max,count);
                char z = s.charAt(i);
                 if(z=='a'|| z=='e' || z=='i' || z=='o' || z=='u'){
                count--;
            }
            i++;
            j++;
            }
        }
        return max;
    }
}