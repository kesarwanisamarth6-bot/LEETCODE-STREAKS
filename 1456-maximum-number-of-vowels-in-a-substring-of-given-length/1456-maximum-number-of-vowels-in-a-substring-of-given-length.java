class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        Queue<Character> q = new LinkedList<>();
        while(j<s.length()){
            char c = s.charAt(j);
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                q.add(c);
            }
            if(j-i+1<k){
                j++;
            }
            else{
                max = Math.max(max,q.size());
                char z = s.charAt(i);
                 if(z=='a'|| z=='e' || z=='i' || z=='o' || z=='u'){
                q.poll();
            }
            i++;
            j++;
            }
        }
        return max;
    }
}