package P26_CopyComplexList;

import java.util.HashMap;

public class CopyComplexList {
	//哈希表的方法 空间换时间
	public RandomListNode Clone(RandomListNode pHead){
		if(pHead == null)
			return null;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        RandomListNode cloneHead = new RandomListNode(pHead.label);
        RandomListNode pre = pHead;
        RandomListNode newpre = cloneHead;
        map.put(pre, newpre);
        //先复制next的路径
        while(pre.next != null){
        	newpre.next = new RandomListNode(pre.next.label);
        	pre = pre.next;
        	newpre = newpre.next;
        	map.put(pre, newpre);
        }
        //复制random部分
        pre = pHead;
        newpre = cloneHead;
        while(newpre!=null){
        	newpre.random = map.get(pre.random);
        	newpre = newpre.next;
        	pre = pre.next;
        	
        }
        return cloneHead;
	}
	//O(n)方法 先创建一个新的链表
	public RandomListNode Clone2(RandomListNode pHead){
		//先创建新旧混合的链表
		if(pHead == null)
			return null;
		RandomListNode pre = pHead;
		while(pre!= null){
			RandomListNode newpre = new RandomListNode(pre.label);
			newpre.next = pre.next;
			pre.next = newpre;
			pre = newpre.next;
		}
		//复制完成 此时head是pHead
		pre = pHead;
		while(pre!=null){
			if(pre.random!=null)
				pre.next.random = pre.random.next;
			pre = pre.next.next;
		}
		//现在按照奇偶数重新拆分两条链表
		RandomListNode newHead = pHead.next;
        RandomListNode newpre = newHead;
        pre = pHead;
        while(pre!=null){
        	pre.next = pre.next.next;
        	if(newpre.next!=null)
        		newpre.next = newpre.next.next;
        	pre = pre.next;
        	newpre = newpre.next;
        }
        return newHead;
		
	}

	
	
}
