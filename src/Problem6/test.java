package Problem6;
import util.TreeNode;
public class test {
	public  static void main(String args[]) throws Exception
	{
		ConstructTree test=new ConstructTree();
		int[] pre={6};
		int[] in={6};
		TreeNode root=test.constructCore(pre,in);
		System.out.println(root.val);
	}
}
