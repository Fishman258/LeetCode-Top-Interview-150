package problems.p007_BestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testMaxProfit() {
        int[] prices = {7,1,5,3,6,4};
        int profit = 5;
        assertEquals(profit, new Solution().maxProfit(prices));
    }
}
