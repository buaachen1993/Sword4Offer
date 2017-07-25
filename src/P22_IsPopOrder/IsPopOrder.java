package P22_IsPopOrder;

import java.util.Stack;
/***
 * 
 * @author chandler
 * 用辅助栈模拟真实的操作
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<Integer> ();
        if(pushA.length != popA.length)
        	return false;
        for(int i = 0,j = 0;i<popA.length;i++)//i标记输入 j标记输出
        {
        	stack.push(pushA[i]);
        	while(j < popA.length && (stack.peek() == popA[j]))
        	{
        		stack.pop();
        		j++;
        	}
        }
        return stack.isEmpty();
    }
}
