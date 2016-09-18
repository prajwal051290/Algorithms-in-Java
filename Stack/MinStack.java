/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack*/

/*
 * Logic: Take one stack. Whenever new min is found while pushing, push the older min maintianed in min variable in stack.
 * This was, min variable gets pushed twice. Worst case i.e. input in descending order will lead to consumin space
 * equivalent to two stacks
 */

public class MinStack {

    private Stack<Integer> minStack;
    private int min;
    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x<=min){
            minStack.push(min);
            min = x;
        }
        minStack.push(x);
    }
    
    public void pop() {
        int num = minStack.pop();
        if(num==min){
            min = minStack.pop();
        }
        if(minStack.isEmpty())
            min = Integer.MAX_VALUE;
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */