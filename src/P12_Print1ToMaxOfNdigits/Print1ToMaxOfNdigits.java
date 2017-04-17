package P12_Print1ToMaxOfNdigits;
/***
 * 打印1到最大的n位数
 * @author chandler
 * 比如输入3 则打印1 2 3 直到999（最大的3位数）
 * 本题比较简单，主要难点在于大数的判断，采用字符串进行大数的计算
 * 
 */
public class Print1ToMaxOfNdigits {
	public void Print1ToMaxOfN(int n){
		if(n<=0)
			return ;
		int[] number = new int[n];
		for(int i =0; i< n;i++)
		{
			number[i] = 0;
		}
		while(!Increment(number))
		{
			PrintNumber(number);
		}
	}
	public boolean Increment(int[] number){
		boolean isOverflow = false;
		int nTakeOver = 0;
		for(int i = number.length -1 ; i>=0;i--)//从低位开始运算
		{
			int nSum = number[i]+nTakeOver;
			if(i == number.length-1)//末位加一
				nSum++;
			if(nSum >= 10){//产生进位{
				if(i==0)
					isOverflow = true;//向最高位产生了进位
				else{
					nSum -= 10;
					nTakeOver = 1;
					number[i] = nSum;
				}
			}
			else{
				number[i] = nSum;
				break;
			}

		}
		return isOverflow;
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
	public static void main(String args[]){
		Print1ToMaxOfNdigits test = new Print1ToMaxOfNdigits();
		test.Print1ToMaxOfN(3);
	}

}
