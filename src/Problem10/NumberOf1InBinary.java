package Problem10;
/***
 * 求二进制的数字1的个数
 * @author chandler
 * 一个数减一和原来做与运算 相当于将最后一个1变成0 
 */
public class NumberOf1InBinary {
	public int NumberOf1(int n)
	{
		int count = 0;
		while(n!=0){
			count++;
			n = (n-1) & n;
		}
		return count;
	}
}
