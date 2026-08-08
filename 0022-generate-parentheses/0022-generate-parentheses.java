class Solution {
static void solve(int open, int close , String op, ArrayList<String>s){
if(open==0 && close ==0){
    s.add(op);
    return;
}

if(open!=0){
    solve(open-1,close,op+"(",s);
}
 
 if (close>open){
    solve(open,close-1,op+")",s);
}
}

    public List<String> generateParenthesis(int n) {
        ArrayList<String> s = new ArrayList<>();
        int open = n;
        int close = n;
        String op = "";
        solve(open,close,op,s);
         return s;
    }
}