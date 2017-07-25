package P21_StackWithMin;

import java.util.Stack;

public class StackWithMin {
	private Stack<Integer> mainStack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        mainStack.push(node);
        int curmin;
        if(minStack.isEmpty()){
        	minStack.push(node);
        }
        else{
        	curmin = minStack.peek();
        	if(curmin > node)
        		minStack.push(node);
        	else
        		minStack.push(curmin);
        }
  

    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}
