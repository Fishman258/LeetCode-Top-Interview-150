package problems.p043_GroupAnagrams;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testGroupAnagrams() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> out = canonicalize(Arrays.asList(
                Arrays.asList("bat"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("ate", "eat", "tea")
        ));
        List<List<String>> actual = canonicalize(new Solution().groupAnagrams(strs));
        assertEquals(out, actual);
    }
    private List<List<String>> canonicalize(List<List<String>> groups) {
        List<List<String>> copy = new ArrayList<>();
        for (List<String> g : groups) {
            List<String> gg = new ArrayList<>(g);
            Collections.sort(gg);
            copy.add(gg);
        }
        copy.sort(Comparator.comparing(Object::toString));
        return copy;
    }
}
