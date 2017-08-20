package P26_CopyComplexList;

public class test {
	public static void main(String args[]){
		RandomListNode t1 = new RandomListNode(1);
		RandomListNode t2 = new RandomListNode(2);
		RandomListNode t3 = new RandomListNode(3);
		RandomListNode t4 = new RandomListNode(4);
		t1.next = t2;
		t2.next = t3;
		t3.next = t4;
		t4.next = null;
		t1.random = t3;
		t2.random = t1;
		t3.random = t4;
		t4.random = t2;
		CopyComplexList test = new CopyComplexList();
		RandomListNode newHead = test.Clone2(t1);
		System.out.println(newHead.label);

	}

}
