package P3_FindInMatrix;
/***
 * 面试题3     一个二维数组，每一行从左到右递增，每一列从上到下递增．输入一个二维数组和一个整数，判断数组中是否含有整数
 * @author chandler
 * resolution:从对角线开始查找，确定数字所在的行和列，然后对行和列进行遍历，大于的时候跳出
 */
public class FindInMatrix {
	//查找二维数组中数的方法
	public boolean find(int testarray[][],int target)
	{
		
		//时刻记住null的判定
		if(testarray == null)
			return false;
		int length = testarray.length;
		
		//首先确定行列数
		int i =0;
		for(i = 0;i < length;i++)
		{
			if(testarray[i][i] == target)
				return true;
			if(testarray[i][i] > target)
				break;
		}
		//注意溢出条件！
		if(i == length)
			return false;
		//行遍历 列的数字发生变化
		for(int column = 0; column < i;column++)
		{
			if(testarray[i][column] > target)
				break;
			if(testarray[i][column] == target)
				return true;

		}
		//列遍历 行的数字发生变化
		for(int row = 0; row < i;row++)
		{
			if(testarray[row][i] > target)
				break;
			if(testarray[row][i] == target)
				return true;
		}
		return false;
	}
}
