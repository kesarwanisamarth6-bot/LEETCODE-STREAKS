class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int profit;
        int sum=0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]>bp){
                profit=prices[i]-bp;
                sum = sum+profit;
                bp=prices[i];
            }
            else{
                bp=prices[i];
            }
        }
        return sum;
    }
}