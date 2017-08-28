package P31_GreatestSumOfSubArray;

import java.util.Scanner;

public class Main {
	 int calDiffer(int n,int[] a,int m, int[] b){
		int orginSumA = 0,orginSumB = 0;
		for(int i = 0;i<n;i++)
			orginSumA += a[i];
		for(int i = 0;i<m;i++)
			orginSumB += b[i];
		int diff = Math.abs(orginSumA-orginSumB);
		int bestdiff = diff;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++)
			{
				int change = a[i]-b[j];
					diff = Math.abs(diff-2*change);
					if(diff == 0)
						return 0;
					int diff2 = calDiffer2(n,a,i,m,b,j,diff);
					if(diff2 < bestdiff)
						bestdiff = diff2;	
			}
		}
		return bestdiff;
	}
	 int calDiffer2(int n,int[] a,int ai,int m, int[] b,int bj,int diff){
		for(int i = 0;i<n;i++){
			if(i == ai)
				continue;
			for(int j = 0;j<m;j++)
			{
				if(j==bj)
					continue;
				int change = a[i]-b[j];
				if (Math.abs(diff-2*change)< diff)
				{
					diff = Math.abs(diff-2*change);
					if(diff == 0)
						return 0;
				}
			}
		}
		return diff;
	}
	public static void main(String[] args) {
		/**
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] b = new int[m];
		for(int i = 0;i<m;i++){
			b[i] = scan.nextInt();
		}
		**/
		int[] a = {1,3,7,9};
		int[] b = {2,10,12};
		int n = 4;
		int m = 3;
		Main test = new Main();
		System.out.println(test.calDiffer(n, a, m, b));
	}
	
}
