package Problem12;
/***
 * 打印1到最大的n位数
 * @author chandler
 * 比如输入3 则打印1 2 3 直到999（最大的3位数）
 * 递归方法 打印n位数字的全排列
 * 
 */
public class Print1ToMaxOfNdigits2 {
	public void Print1ToMaxOfN(int n){
		if(n <= 0)
			return;
		int[] number = new int[n];
		for(int i = 0;i < n;i++)
			number[i] = 0;
		printArray(number,0);
	}
	public void printArray(int[] number,int n){
		for(int i = 0; i < 10;i++){
			if(n!=number.length)
			{
				number[n]=i;
				printArray(number,n+1);
			}
			else{
				PrintNumber(number);
				return;
			}
		}
	}
	public void PrintNumber(int[] number){
		boolean isBegin = false;
		for(int i=0;i< number.length;i++){
			if(!isBegin && number[i] != 0)
				isBegin = true;
			if(isBegin)
				System.out.print(number[i]);
		}
		System.out.println();
	}
}
