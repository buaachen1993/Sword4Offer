package P13_DeleteNodeInList;

import util.ListNode;

public class test {
	public static void main (String args[])
	{
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		DeleteNodeInList test=new DeleteNodeInList();
		test.DeleteNode(node1, node2);
		System.out.println(node1.next.next.val);
	}
}
