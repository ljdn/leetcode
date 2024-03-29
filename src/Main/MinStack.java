package Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lduan on 8/9/17.
 */
public class MinStack {
    /**
    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.
    Example:
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin();   --> Returns -3.
    minStack.pop();
    minStack.top();      --> Returns 0.
    minStack.getMin();   --> Returns -2.
    */

    /** initialize your data structure here. */

    List<Integer> stack;
    List<Integer> mins;

    public MinStack() {
        stack = new ArrayList<>();
        mins = new ArrayList<>();
    }

    public void push(int x) {
        if (mins.isEmpty() || x <= mins.get(mins.size() - 1)) mins.add(x);
        stack.add(x);
    }

    public void pop() {
        if (stack.get(stack.size() - 1) == this.getMin()) mins.remove(mins.size() - 1);
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return mins.get(mins.size() - 1);
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */


}

