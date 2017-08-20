package P27_ConvertBinarySearchTree;

import util.TreeNode;
/***
 * @author chandler
 *
 */
public class ConvertBinarySearchTree {
	TreeNode leftlast = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
    	if(pRootOfTree == null)
    		return null;
    	convertSub(pRootOfTree);
    	TreeNode temp = pRootOfTree;
    	while(temp.left!= null)
    		temp = temp.left;
    	return temp;
    }
    public void convertSub(TreeNode pRootOfTree){
    	if(pRootOfTree == null)
    		return;
    	convertSub(pRootOfTree.left);
    	//左子树处理完成之后
    	pRootOfTree.left = leftlast;
    	if(leftlast != null)
    		leftlast.right = pRootOfTree;
    	leftlast = pRootOfTree;
    	convertSub(pRootOfTree.right);	
    }   
}
