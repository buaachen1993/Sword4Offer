package Problem13;

import util.ListNode;
/***
 * problem 13 在O(1)时间内删除节点
 * @author chandler
 * 将目标节点的next赋予目标节点 然后删除下一个
 */
public class DeleteNodeInList {
	void DeleteNode(ListNode head,ListNode toBeDeleted){
		//边界条件
		if(head == null || toBeDeleted == null)
			return;
		if(toBeDeleted.next != null){//需要删除的节点不是尾节点
			toBeDeleted.val = toBeDeleted.next.val;
			toBeDeleted.next = toBeDeleted.next.next;
		}
		else if(head == toBeDeleted){//只有一个节点 删除头结点
			head = null;
		}
		else{//删除尾节点
			ListNode temp = head;
			while(temp.next != toBeDeleted){
				temp = temp.next;
			}
			temp.next = null;
		}
	}
}
