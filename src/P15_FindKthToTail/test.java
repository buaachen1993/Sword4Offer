package P15_FindKthToTail;

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
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		FindKthToTail test = new FindKthToTail();
		System.out.println(test.FindKthToTail(node1, 3).val);
		
	}
}
