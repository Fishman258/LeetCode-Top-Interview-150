package problems.p008_BestTimeToBuyAndSellStock2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testMaxProfit() {
        int[] prices = {7,1,5,3,6,4};
        int profit = 7;
        assertEquals(profit, new Solution().maxProfit(prices));
    }
}
