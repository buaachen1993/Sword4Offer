package P17_Merge;

import util.ListNode;

public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	ListNode head = new ListNode(0);
    	ListNode temp = head ;
    	while(list1 != null || list2 != null)
    	{
    		ListNode cur = null;
    		if(list1 == null)
    		{
    			cur = list2;
    			list2 = list2.next;
    		}else if(list2 == null){
    			cur = list1;
    			list1 = list1.next;
    		}else{
    			if(list1.val < list2.val){
    				cur = list1;
    				list1 = list1.next;
    			}else{
    				cur = list2;
    				list2 = list2.next;
    			}		
    		}
    		temp.next = cur;
    		temp = temp.next;
    	}
    	return head.next;
    }

}
