package P6_ConstructTree;

import java.util.Arrays;
import util.TreeNode;

/***
 * 面试题6 重建二叉树
 * @author chandler
 * 前序 中序和后序遍历二叉树的区别在于根节点的访问优先级 这是一道递归算法的题 核心在于递归的参数和终止条件
 * 根据前序和中序生成，遍历中序序列
 * 学习throws的写法
 */
public class ConstructTree {
	public TreeNode constructCore(int[] pre,int[] in) throws Exception{
		TreeNode root = new TreeNode() ;
		boolean hasroot = false;
		if(pre.length != in.length){
			throw new Exception("长度不同！");
		}
		if(pre.length == 0  || in.length == 0)
			return null;
		for(int i = 0;i < in.length;i++)
		{
			if(in[i] == pre[0])//找到了根节点，分成两个子树
			{
				hasroot = true;
				root.val = in[i];
				root.left = constructCore(
						Arrays.copyOfRange(pre, 1,i+1),Arrays.copyOfRange(in, 0,i));
				root.right = constructCore(
						Arrays.copyOfRange(pre, i+1,pre.length),Arrays.copyOfRange(in, i+1, in.length));
			}
		}
		if(!hasroot)
			throw new Exception("没有根节点");
		
		return root;
	}
}
