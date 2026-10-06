class Solution {
    public int minAddToMakeValid(String s) {

        if(s.length()==0){
            return 0;
        }

        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if(c=='('){
                st.push(c);
            }
            else{
                     if(!st.isEmpty()){
                        char prev = st.peek();
                             if(prev=='('){
                                st.pop();
                            }
                            else{
                                st.push(c);
                            }
                         }
                      else{
                         st.push(c);
                   
                   
                          }
                }
            }

            return st.size();

        }

    }

    




























        // int op = 0;
        // int cl = 0;
        
        // for(int i = 0;i<s.length();i++){
        //     char c = s.charAt(i);
        //     if(c=='('){
        //         op++;
        //     }
        //     else{
        //         cl++;
        //     }
        // }

        // int max  = Math.max(op,cl);
        // int sum = op+cl;
        // int total = max*2;
        // return total - sum;
