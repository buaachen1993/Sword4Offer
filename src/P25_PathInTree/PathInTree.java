package P25_PathInTree;

import java.util.ArrayList;

import util.TreeNode;

public class PathInTree {
	ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	if(root == null)
    		return listAll;
    	list.add(root.val);
    	//更新本层的合
    	target = target - root.val;
    	if(target == 0 && root.left == null && root.right == null)
    		listAll.add(new ArrayList<Integer>(list));//这里注意不能直接add list
    	FindPath(root.left,target);
    	FindPath(root.right,target);
    	//回到递归的上一层需要移除当前的元素
        list.remove(list.size()-1);
        return listAll;
    }	
}
