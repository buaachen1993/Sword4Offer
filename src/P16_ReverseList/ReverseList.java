package P16_ReverseList;

import util.ListNode;

public class ReverseList {
    public ListNode ReverseList(ListNode head) {
    	if(head == null)
    		return null;
    	if(head.next == null)
    		return head;
    	ListNode pre = head;
    	ListNode temp = head.next;
    	//头结点单独处理
    	pre.next = null;
    	while(temp != null)
    	{
    		ListNode next = temp.next;
    		temp.next = pre;
    		pre = temp;
    		temp = next;
    	}
    	return pre;
    }
}
