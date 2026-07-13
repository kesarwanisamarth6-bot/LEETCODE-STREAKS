class Solution {
    public int minimumRecolors(String blocks, int k) {
     int min = Integer.MAX_VALUE;
     int i = 0;
     int j = 0;
     int count = 0;
     while(j<blocks.length()){
        char c = blocks.charAt(j);
        if(c=='W'){
            count++;
        }
        if(j-i+1<k){
            j++;
        }
        else if (j-i+1==k){
            min = Math.min(min,count);
        
        if(blocks.charAt(i)=='W'){
            count--;
        }
        i++;
        j++;

     }
     } 

     return min;
    }
}