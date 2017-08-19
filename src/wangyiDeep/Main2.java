package wangyiDeep;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int i;
		int[] b = new int[n];
		for(i = 0;i < n;i++){
			a[i] = scan.nextInt();
		}

		if(n%2 ==0){
			for(i= n-1;i>0;i = i-2)
				System.out.print(a[i]+" ");
			for(i = 0;i<n-2;i=i+2)
				System.out.print(a[i]+" ");
		}else{
			for (i = n - 1; i >=0; i = i - 2)
				System.out.print(a[i]+" ");
			for (i = 1; i < n - 2; i = i + 2)
				System.out.print(a[i]+" ");
		}
		System.out.print(a[i]);
	}

}
