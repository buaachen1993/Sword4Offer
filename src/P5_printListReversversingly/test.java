package P5_printListReversversingly;

import util.ListNode;

/**
 * Created by liujia on 14-8-26.
 */
public class test {
	public static void main (String args[])
	{
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		printListReversversingly2 test=new printListReversversingly2();
		test.printListReverse(node1);
	}

}