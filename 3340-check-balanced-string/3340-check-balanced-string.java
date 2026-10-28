class Solution {
    public boolean isBalanced(String num) {
        int even = 0;
        int odd = 0;
      for(int i = 0;i<num.length();i= i+2){
        int n = num.charAt(i) - '0';
        even+= n;
      }
         for(int j = 1;j<num.length();j=j+2){
        int n = num.charAt(j) - '0';
        odd+= n;
      }
      if(even==odd){
        return true;
      }
      return false;

    }
}