package P23_PrintFromTopToBottom;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import util.TreeNode;

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
        	return result;
        //注意queue的定义
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
        	TreeNode temp = queue.poll();
        	if(temp.left != null)
        		queue.offer(temp.left);
        	if(temp.right != null)
        		queue.offer(temp.right);
        	result.add(temp.val);
        	
        }
        return  result;
    }
}
