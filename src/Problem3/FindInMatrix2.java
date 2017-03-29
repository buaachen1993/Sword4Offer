package Problem3;
/***
 * 从右上角开始查找的方法更为简单直接
 * @author chandler
 *
 */
public class FindInMatrix2 {
	public boolean find(int testarray[][],int target){
		if(testarray==null||testarray.length==0||(testarray.length==1&&testarray[0].length==0)) 
			return false;
		int column = testarray.length - 1;
		int row = 0;
		while(row < testarray.length && column >=0)
		{
			if(testarray[row][column] == target)
				return true;
			if(testarray[row][column] > target)
				column--;
			else
				row++;
		}
		return false;
	}

}
