package souhu;

import Problem5.printListReversversingly2;
import util.ListNode;

public class PartitionList {
	public ListNode parition(ListNode head,int x){
		if(head == null||head.next == null)
			return head;
		ListNode smallHead = new ListNode(0);
		ListNode bigHead = new ListNode(0);
		ListNode temps = smallHead;
		ListNode tempb = bigHead;
		while(head!=null)
		{
			if(head.val < x){
				temps.next = head;
				temps = temps.next;
			}
			else
			{
				tempb.next = head;
				tempb = tempb.next;
			}
			head = head.next;
		}
		temps.next = bigHead.next;
		tempb.next = null;
		return smallHead.next;
	}
	public static void main (String args[])
	{
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(5);
		ListNode node3=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		PartitionList test = new PartitionList();
		ListNode temp = test.parition(node1, 7);
		System.out.println(temp.next.val);

	}
}
