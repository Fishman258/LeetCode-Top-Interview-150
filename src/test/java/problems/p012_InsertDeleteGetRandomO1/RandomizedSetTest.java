package problems.p012_InsertDeleteGetRandomO1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomizedSetTest {
    @Test
    void exampleTestFromLeetCode() {
        RandomizedSet randomizedSet = new RandomizedSet();

        // ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
        // [[],[1],[2],[2],[],[1],[2],[]]

        assertTrue(randomizedSet.insert(1));   // 插入 1，应该返回 true
        assertFalse(randomizedSet.remove(2));  // 删除不存在的 2，应该返回 false
        assertTrue(randomizedSet.insert(2));   // 插入 2，应该返回 true

        int rand = randomizedSet.getRandom();  // getRandom 应该返回 1 或 2
        assertTrue(rand == 1 || rand == 2);

        assertTrue(randomizedSet.remove(1));   // 删除 1，true
        assertFalse(randomizedSet.insert(2));  // 再插入 2，已存在，false

        rand = randomizedSet.getRandom();      // 现在只有 2，必然返回 2
        assertEquals(2, rand);
    }

    @Test
    void testInsertAndRemoveBasic() {
        RandomizedSet set = new RandomizedSet();

        assertTrue(set.insert(10));
        assertTrue(set.insert(20));
        assertTrue(set.insert(30));
        assertFalse(set.insert(20));   // 重复插入，应该 false

        assertTrue(set.remove(20));
        assertFalse(set.remove(20));   // 再删一次，应该 false
    }

    @Test
    void testGetRandomAlwaysInSet() {
        RandomizedSet set = new RandomizedSet();
        set.insert(5);
        set.insert(10);
        set.insert(15);

        // 多次调用 getRandom，看返回值是否都在 {5,10,15} 中
        for (int i = 0; i < 100; i++) {
            int x = set.getRandom();
            assertTrue(x == 5 || x == 10 || x == 15);
        }
    }
}
