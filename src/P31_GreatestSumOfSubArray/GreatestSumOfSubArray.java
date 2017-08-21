package P31_GreatestSumOfSubArray;

public class GreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null||array.length == 0)
        	return 0;
        //记录当前最大的sum
        int tsum = 0;
        int result = array[0];
        for(int i = 0;i < array.length;i++)
        {
        	if(tsum < 0)
        		tsum = array[i];//遇到负值抛弃前面所有
        	else
        		tsum += array[i];
        	if(tsum > result)
        		result = tsum;
        }
        return result;   
    }


}
