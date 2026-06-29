class Solution {
    public String removeStars(String s) {
    //  Stack<Character> ans = new Stack<>();
    //  for(int i=0;i<s.length();i++){
    //     char c = s.charAt(i);
    //     if(c=='*'){
    //         ans.pop();
    //     }
    //     else{
    //         ans.push(c);
    //     }
    //  }   

     StringBuilder sb = new StringBuilder();
    //  while(!ans.isEmpty()){
    //     sb.append(ans.pop());
    //  }
    //  return sb.reverse().toString();
    for(int i =0;i<s.length();i++){
        char c = s.charAt(i);
            if (c == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}