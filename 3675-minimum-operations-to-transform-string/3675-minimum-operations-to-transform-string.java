
class Solution {
    public int minOperations(String s) {
        char minChar = '{'; 

        for (char ch : s.toCharArray()) {
            if (ch != 'a') {
                minChar = (char) Math.min(minChar, ch);
            }
        }

        if (minChar == '{') {
            return 0; 
        }

        return 'z' - minChar + 1;
    }
}