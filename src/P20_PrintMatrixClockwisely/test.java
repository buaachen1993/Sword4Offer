package P20_PrintMatrixClockwisely;

import java.util.ArrayList;

public class test {
	public static void main(String args[]){
		int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		PrintMatrixClockwisely test = new PrintMatrixClockwisely();
    	ArrayList result = test.printMatrix(matrix);
    	for(int i = 0;i< result.size();i++)
    		System.out.print(result.get(i)+" ");
	}
}
