package problems.p060_CopyListWithRandomPointer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    /**
     * Build a random-pointer list from:
     * - vals: node values in order
     * - randomIndex: randomIndex[i] is the index of the node that node i.random points to,
     *   or -1 if random is null.
     */
    private Node buildList(int[] vals, int[] randomIndex) {
        if (vals == null || vals.length == 0) return null;
        if (randomIndex == null || randomIndex.length != vals.length) {
            throw new IllegalArgumentException("randomIndex must have same length as vals");
        }

        Node[] nodes = new Node[vals.length];
        for (int i = 0; i < vals.length; i++) {
            nodes[i] = new Node(vals[i]);
        }
        for (int i = 0; i < vals.length - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }
        for (int i = 0; i < vals.length; i++) {
            int ri = randomIndex[i];
            nodes[i].random = (ri == -1) ? null : nodes[ri];
        }
        return nodes[0];
    }

    /**
     * Verify:
     * 1) structure matches expected (values + random targets by index)
     * 2) deep copy: no copied node is the same reference as an original node
     */
    private void assertDeepCopy(Node original, Node copy, int[] expectedVals, int[] expectedRandomIndex) {
        // Collect nodes in order for original and copy
        List<Node> origList = new ArrayList<>();
        List<Node> copyList = new ArrayList<>();

        Node cur = original;
        while (cur != null) {
            origList.add(cur);
            cur = cur.next;
        }

        cur = copy;
        while (cur != null) {
            copyList.add(cur);
            cur = cur.next;
        }

        assertEquals(expectedVals.length, origList.size(), "Original length mismatch");
        assertEquals(expectedVals.length, copyList.size(), "Copy length mismatch");

        // Value check + deep copy reference check
        for (int i = 0; i < expectedVals.length; i++) {
            assertEquals(expectedVals[i], origList.get(i).val, "Original val mismatch at " + i);
            assertEquals(expectedVals[i], copyList.get(i).val, "Copy val mismatch at " + i);

            assertNotSame(origList.get(i), copyList.get(i), "Node was not deep-copied at index " + i);
        }

        // Random pointer index check
        for (int i = 0; i < expectedVals.length; i++) {
            Node origRandom = origList.get(i).random;
            Node copyRandom = copyList.get(i).random;

            int expected = expectedRandomIndex[i];

            if (expected == -1) {
                assertNull(origRandom, "Original random should be null at " + i);
                assertNull(copyRandom, "Copy random should be null at " + i);
            } else {
                assertSame(origList.get(expected), origRandom, "Original random mismatch at " + i);
                assertSame(copyList.get(expected), copyRandom, "Copy random mismatch at " + i);

                // Extra safety: copy's random must never point into original list
                assertNotSame(origList.get(expected), copyRandom, "Copy random incorrectly points to original at " + i);
            }
        }
    }

    @Test
    public void testCopyRandomList_example1() {
        // Example: [[7,null],[13,0],[11,4],[10,2],[1,0]]
        // vals:          7   13   11   10   1
        // random index: -1   0    4    2    0
        int[] vals = {7, 13, 11, 10, 1};
        int[] randomIdx = {-1, 0, 4, 2, 0};

        Node head = buildList(vals, randomIdx);

        Solution solution = new Solution();
        Node copied = solution.copyRandomList(head);

        assertDeepCopy(head, copied, vals, randomIdx);
    }
}
