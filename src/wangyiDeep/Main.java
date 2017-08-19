package wangyiDeep;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static int[][] distance;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		distance = new int[n+1][n+1];
		ArrayList<Position> qizi_pos = new ArrayList<Position> ();
		for(int i=0; i<n; i++) {
			Position pos = new Position();
			pos.x = sc.nextInt();
			qizi_pos.add(pos);
		}
		for(int i=0; i<n; i++) {
			qizi_pos.get(i).y = sc.nextInt();
		}	
		for(int i=0; i<qizi_pos.size()-1; i++) {
			for(int j=i+1; j<qizi_pos.size(); j++) {				
				distance[i][j] = Math.abs(qizi_pos.get(i).x - qizi_pos.get(j).x) + Math.abs(qizi_pos.get(i).y - qizi_pos.get(j).y);
				distance[j][i] = distance[i][j];
			}
		}
		for (int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				for(int k=j; k<n; k++) {
					if (distance[i][j] > distance[i][k]) {
						int temp = distance[i][j];
						distance[i][j] = distance[i][k];
						distance[i][k] = temp;
					}
				}
			}
		}
		System.out.print("0");
		for (int i=2; i<=n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j=0; j<n; j++) {
				int k_ans = 0;
				for(int k=0; k<i; k++) {
					k_ans += distance[j][k];
				}
				if (min > k_ans) min = k_ans;
			}	
			System.out.print(" " + min);
		}
	}
	
}

class Position {
	int x = 0;
	int y = 0;	
}