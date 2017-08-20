package P27_ConvertBinarySearchTree;

import util.TreeNode;

public class test {
	public static void main(String args[]){
		TreeNode t1  = new TreeNode(10);
		TreeNode t2  = new TreeNode(6);
		TreeNode t3  = new TreeNode(4);
		TreeNode t4  = new TreeNode(8);
		TreeNode t5  = new TreeNode(14);
		TreeNode t6  = new TreeNode(12);
		TreeNode t7  = new TreeNode(16);
		t1.left = t2;
		t1.right = t5;
		t2.left = t3;
		t2.right = t4;
		t5.left = t6;
		t5.right = t7;
		ConvertBinarySearchTree test = new ConvertBinarySearchTree();
		TreeNode newhead = test.Convert(t1);
		System.out.println(newhead.val);

	}

}
