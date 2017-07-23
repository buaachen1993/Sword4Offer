package P15_FindKthToTail;
import util.ListNode;

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
    	if(head == null||k <= 0)
    		return null;
    	//后移k个
    	ListNode temp = head;
    	for(int i = 0;i < k-1;i++)
    	{
    		if(temp.next != null)
    			temp = temp.next;
    		else
    			return null;//如果倒数不够k个
    	}
    	//System.out.println(temp.val);
    	//开始两个指针同时后移
    	while(temp.next!=null)
    	{
    		head = head.next;
    		temp = temp.next;
    	}
    	
    	return head;
    	
    }
}
