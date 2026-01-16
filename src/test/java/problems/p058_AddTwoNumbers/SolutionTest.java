package problems.p058_AddTwoNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode l3 = new Solution().addTwoNumbers(l1, l2);
        ListNode out = new ListNode(7);
        out.next = new ListNode(0);
        out.next.next = new ListNode(8);
        while (l3 != null && out != null) {
            assertEquals(l3.val, out.val);
            l3 = l3.next;
            out = out.next;
        }
    }
}
