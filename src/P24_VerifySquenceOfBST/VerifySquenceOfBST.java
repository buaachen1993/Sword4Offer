package P24_VerifySquenceOfBST;

import java.util.Arrays;

public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
    	//寻找根节点
    	int len = sequence.length;
    	if(len == 0)
    		return false;
    	int root = sequence[len-1];
    	int i =0;
    	//左子树
    	for(i=0;i<len-1;i++)
    	{
    		if(sequence[i] > root)
    			break;
    	}
    	//右子树
    	int j = i;
    	for( j = i;j< len-1;j++)
    	{
    		if(sequence[j] < root)
    			return false;
    	}
    	//当前root的左右子树
    	boolean left = true;
    	if(i>0)
    		left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
    	boolean right = true;
    	if(i<sequence.length-1)
    		right=VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length-1));
    	return left&&right;
    	
    }
}
