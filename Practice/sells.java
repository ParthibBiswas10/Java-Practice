public class Sells {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];   // 2
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
    
    public static void main(String[] args) {
        Sells solution = new Sells();
        
        int[] prices = {7, 1, 5, 3, 6, 8};
        int result = solution.maxProfit(prices);
        
        System.out.println("Maximum profit: " + result);
    }
}
