package P14_ReorderOddEven;
/***
 * problem 14 调整数组顺序使奇数位于偶数前面
 * @author chandler
 * 用两个指针 一前一后 直到前一个为奇数 后一个为偶数的时候交换
 */
public class ReorderOddEven {
    public void reOrderArray(int[] array) {
        if(array == null || array.length ==0)
        	return;
        int begin = 0;
        int end = array.length-1;
        while(begin < end)
        {
        	while(begin<end && array[begin]%2 !=0)
        		begin++;
        	while(begin < end && array[end]%2 == 0)
        		end--;
        	//swap
        	int t = array[begin];
        	array[begin] = array[end];
        	array[end] = t;
        	begin++;
        	end--;
        }
    }	
}
