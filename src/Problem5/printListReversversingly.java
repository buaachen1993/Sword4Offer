package Problem5;
/***
 * 面试题5 从尾到头打印链表
 * @author chandler
 * 用一个栈存储下所有节点的信息
 */
import java.util.Stack;

import util.ListNode;

public class printListReversversingly {
	
	public void printListReverse(ListNode head){
		Stack<Integer> st = new Stack();
		while(head != null)
		{
			st.push(head.val);
			head = head.next;
		}
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}
	}
}
