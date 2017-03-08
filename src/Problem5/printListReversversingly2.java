package Problem5;
/***
 * 面试题5 从尾到头打印链表
 * @author chandler
 * 递归算法，每次如果有next就先打印next
 */
import java.util.Stack;

import util.ListNode;

public class printListReversversingly2 {
	
	public void printListReverse(ListNode head){
		if(head != null){
			if(head.next != null)
				printListReverse(head.next);
			System.out.println(head.val);
		}
	}
}
