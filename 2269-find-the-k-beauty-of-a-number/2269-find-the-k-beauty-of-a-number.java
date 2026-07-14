class Solution {
    public int divisorSubstrings(int num, int k) {
    int i = 0;
    int j = 0;
    int count=0;
    int sum = 0;
    String str = Integer.toString(num);
    String s="";
   while(j<str.length()){
        s=s+str.charAt(j);
        if(j-i+1<k){
            j++;
        }
        else if (j-i+1==k){
            int n = Integer.parseInt(s);
            if( n!=0 && num%n==0){
                count++;
            }
            s=s.substring(1);
            i++;
            j++;
        }
    }
    return count;
    }

}