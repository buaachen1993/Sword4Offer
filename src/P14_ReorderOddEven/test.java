package P14_ReorderOddEven;

public class test {
	public static void main (String args[])
	{
		int[] testarray = {2,6,7,8,9,3};
		ReorderOddEven test = new ReorderOddEven();
		test.reOrderArray(testarray);
		for(int i = 0;i < testarray.length;i++){
			System.out.println(testarray[i]);
		}
	}
}
