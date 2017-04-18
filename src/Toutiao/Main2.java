package Toutiao;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static int binarySearch(int a[],int goal){  
        int high=a.length-1;  
        int low=0;  
        while (low<=high) {  
            int middle=(low+high)/2;  
            if (a[middle]==goal) {  
				System.out.print(goal);
				System.out.print(" ");
				return 0;
            }  
            else if (a[middle]>goal) {  
                high=middle-1;  
            }  
            else {  
                low=middle+1;  
            }  
        }  
        return -1;  
      
          
    }  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int[] a = new int[m];
		for(int i = 0;i < m;i++){
			a[i] = scan.nextInt();
		}
		int n = scan.nextInt();
		int[] b = new int[n];
		for(int i = 0;i < n;i++)
		{
			b[i] = scan.nextInt();
		}
//		int[] a = {1,2,3,4,5};
//		int[] b = {5,4,3};
//		int m = 3;
//		int n = 5;
		Arrays.sort(a);
		for(int i = 0;i<n;i++)
		{
			binarySearch(a,b[i]);
		}	
	}

}
