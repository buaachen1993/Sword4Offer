package P25_PathInTree;

import java.util.ArrayList;

import P23_PrintFromTopToBottom.PrintFromTopToBottom;
import util.TreeNode;

public class test {
	public static void main(String args[]){
		TreeNode t1_1  = new TreeNode(8);
		TreeNode t1_2  = new TreeNode(8);
		TreeNode t1_3  = new TreeNode(7);
		TreeNode t1_4  = new TreeNode(9);
		TreeNode t1_5  = new TreeNode(2);
		TreeNode t1_6  = new TreeNode(4);
		TreeNode t1_7  = new TreeNode(7);
		TreeNode t2_1  = new TreeNode(8);
		TreeNode t2_2  = new TreeNode(9);
		TreeNode t2_3  = new TreeNode(2);
		t1_1.left = t1_2;
		t1_1.right = t1_3;
		t1_2.left = t1_4;
		t1_2.right = t1_5;
		t1_5.left = t1_6;
		t1_5.right =  t1_7;
		t2_1.left = t2_2;
		t2_1.right = t2_3;
		PathInTree test = new PathInTree();
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
		listAll = test.FindPath(t1_1, 12);

	}

}