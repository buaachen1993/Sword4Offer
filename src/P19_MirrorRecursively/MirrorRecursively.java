package P19_MirrorRecursively;

import util.TreeNode;

public class MirrorRecursively {
    public void Mirror(TreeNode root) {
        if(root == null)
        	return;
        if(root.left == null && root.right == null)
        	return;
        
        //交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        //递归
        Mirror(root.left);
        Mirror(root.right);
        
    }
}
