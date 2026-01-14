package problems.p054_MinStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

}
class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int val) {
        stack.push(val);
        minStack.push(Math.min(minStack.getFirst(), val));
    }
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    public int top() {
        return stack.getFirst();
    }
    public int getMin() {
        return minStack.getFirst();
    }
}
