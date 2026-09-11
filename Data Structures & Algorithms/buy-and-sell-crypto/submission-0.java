class Solution {
    public int maxProfit(int[] prices) {
        int c=0;
        int min=prices[0];
        for(int i=0; i<prices.length; i++){
            if(min>prices[i]){
                min =prices[i];
            }
            int max=prices[i]-min;
            if(c<max){
                c=max;
            }
        }
        return c;
    }
}
