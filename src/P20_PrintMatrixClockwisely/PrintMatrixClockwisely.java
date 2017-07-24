package P20_PrintMatrixClockwisely;

import java.util.ArrayList;

public class PrintMatrixClockwisely {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	ArrayList result = new ArrayList<Integer>();
    	int rows = matrix.length;
    	int cols = matrix[0].length;
    	if(rows == 0)
    		return result;
    	//层数
    	int layers = (Math.min(rows,cols)-1)/2+1;//奇数/2 +1 偶数/2
    	for(int i = 0;i < layers;i++)
    	{
    		int endx = cols -i;
    		int endy = rows -i;
    		for(int a = i;a< endx ;a++)
    			result.add(matrix[i][a]);
    		for(int b = i+1 ;b < endy;b++ )
    			result.add(matrix[b][endx-1]);
    		for(int c = endx-2;c >=i && (endy-1) != i;c-- )
    			result.add(matrix[endy-1][c]);
    		for(int d = endy-2;d>i && (endx-1 != i) ;d--)
    			result.add(matrix[d][i]);
//    		for(int j = i;j<cols-i;j++)//从左到右
//    			result.add(matrix[i][j]);
//    		for(int k = i+1; k<rows-i; k++)//从上到下
//    			result.add(matrix[k][cols-i-1]);
//    		for(int m = cols-i-2; m>=i && (rows-i-1 != i);m-- )//从右到左
//    			result.add(matrix[rows-i-1][m]);
//    		for(int n = rows-i-2;n>i && (cols-i-1 != i) ;n--)
//    			result.add(matrix[n][i]);
    	}
    	return result;
    	
    }
}
