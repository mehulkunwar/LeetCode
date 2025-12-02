package Easy;

// Best time to buy and sell stock
// Time Complexity - O(n)
// Space Complexity - O(1)

public class LeetCode121 {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int currMin = prices[0];

            for(int i : prices){
                currMin = Math.min(currMin,i);
                maxProfit = Math.max(maxProfit,i - currMin);
            }

            return maxProfit;
        }

}
