package problems.p059_MergeTwoSortedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    private ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : values) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    private int[] listToArray(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        int[] arr = new int[len];
        cur = head;
        int i = 0;
        while (cur != null) {
            arr[i++] = cur.val;
            cur = cur.next;
        }
        return arr;
    }

    @Test
    public void testMergeTwoLists_basic() {
        Solution solution = new Solution();

        ListNode list1 = buildList(new int[]{1, 2, 4});
        ListNode list2 = buildList(new int[]{1, 3, 4});

        ListNode result = solution.mergeTwoLists(list1, list2);

        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, listToArray(result));
    }
}
