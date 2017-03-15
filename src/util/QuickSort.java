package util;

public class QuickSort {
	
	public static void quickSort(int[] array){
		if(array != null)
			quickSort(array,0,array.length-1);
	}
	public static void quickSort(int[] array,int begin,int end){
		if(begin >=end || array == null)
			return;
		int index = partition(array,begin,end);
		quickSort(array,begin,index-1);
		quickSort(array,index+1,end);
	}
	
	private static int partition(int[] array,int beg,int end){  
        int small = beg -1;  
        for (int index = beg; index < end; index++) {  
            if(array[index] < array[end]){  
                small++;  
                if(small != index){  
                	int temp = array[small];
                	array[small] = array[index];
                	array[index] = temp;
                }  
            }  
        } 
        small++;
        if(small != end){  
        	int temp = array[small];
        	array[small] = array[end];
        	array[end] = temp;
        }  
        return small;  
    }
	
	public static void main(String args[]){
		int a = 1;
		int b = 1;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);
		int array[]  = {3,5,7,1,4,2};
		quickSort(array);
		for(int i = 0;i < array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
 