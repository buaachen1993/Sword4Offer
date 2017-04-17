package P9_Fibonacci;

public class Fibonacci {
	public long fibonacci(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
        long cur = 1,pre = 0;//当前数和前一个数
    	long result = 0;
    	for(int i = 2; i <= n ; i++)
    	{	
    		result = cur + pre;
    		pre = cur;
    		cur = result;
    	}
    	return result;   

	}
}
