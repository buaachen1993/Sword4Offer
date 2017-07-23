package P17_Merge;

import util.ListNode;

public class test {
	public static void main (String args[])
	{
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		ListNode node7=new ListNode(7);
		ListNode node8=new ListNode(8);
		node1.next=node2;
		node2.next=node3;
		node3.next=null;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		Merge test = new Merge();
		ListNode head = test.Merge(node1, node4);
		System.out.println(head.val);
	}
}
