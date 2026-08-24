class Solution {
    public int lengthOfLastWord(String s) {
    String news = s.trim();
    int count = 0;
    for(int i=news.length()-1;i>=0;i--){
        if(news.charAt(i)==' '){
            break;
        }
        else{
            count++;
        }
    }

    return count;
    }
}