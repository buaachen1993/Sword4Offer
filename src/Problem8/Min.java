package Problem8;
/***
 * 旋转数组的最小数字
 * @author chandler
 * 采用折半查找法  取中间元素 如果大于首元素 则begin= mid 如果小于尾元素 则 end=mid 
 * 直到begin+1 = end
 */
public class Min {
	public int minInReversingList(int[] array) throws Exception{
		if(array == null)
			throw new Exception("数组为空！");
		int left = 0;
		int right = array.length -1;
		int mid = 0;
		while(array[left] >= array[right])
		{
			if(right-left == 1)
			{
				mid = right;
				break;
			}
			mid = (right+left)/2;
			if((array[mid] == array[left]) && (array[mid] == array[right])){//遍历查找
				for(int i = left;i <=right;i++){
					if(array[i] < array[mid])
						mid = i;
				}
				break;
			}
			else{
				if(array[mid] >= array[left])
					left = mid;
				else if (array[mid] <= array[right])
					right = mid;
			}
		}
		return array[mid];
	}
}
