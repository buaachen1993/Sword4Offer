package Toutiao;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main4 {
	
	public static void main(String[] args) throws ScriptException {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
//		String input = "10 + 20";
	    ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");
        double d = (double) se.eval(input);
        String result = String.valueOf((int)d);
        input = input + " = " + result;
		StarPrint(input);
	}

	private static void StarPrint(String input) {
		char[][] P = new char[9][40];
		for(int i = 0;i<9;i++)
		{
			for(int j = 0;j< 40;j++)
				P[i][j] = ' ';
		}
		int len = 0;
		for(int i = 0;i<input.length();i++){
			char cur = input.charAt(i);
//			if(cur == ' ')
//			{
//				len = len +3;
//			}
		    if(cur == '1')
			{
				P[0][len] = '*';
				P[1][len] = ' ';
				P[2][len] = '*';
				P[3][len] = ' ';				
				P[4][len] = '*';			
				P[5][len] = ' ';			
				P[6][len] = '*';				
				P[7][len] = ' ';				
				P[8][len] = '*';
				len = len+3;
			}
			else if(cur == '0'){
				P[0][len] = '*';P[0][len+1] = '*';P[0][len+2] = '*';
				P[2][len] = '*';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = '*';P[4][len+1] = ' ';P[4][len+2] = '*';
				P[6][len] = '*';P[6][len+1] = ' ';P[6][len+2] = '*';
				P[8][len] = '*';P[8][len+1] = '*';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '2'){
				P[0][len] = '*';P[0][len+1] = '*';P[0][len+2] = '*';
				P[2][len] = ' ';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				P[6][len] = '*';P[6][len+1] = ' ';P[6][len+2] = ' ';
				P[8][len] = '*';P[8][len+1] = '*';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '3'){
				P[0][len] = '*';P[0][len+1] = '*';P[0][len+2] = '*';
				P[2][len] = ' ';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				P[6][len] = ' ';P[6][len+1] = ' ';P[6][len+2] = '*';
				P[8][len] = '*';P[8][len+1] = '*';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '4'){
				P[0][len] = '*';P[0][len+1] = ' ';P[0][len+2] = '*';
				P[2][len] = '*';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				P[6][len] = ' ';P[6][len+1] = ' ';P[6][len+2] = '*';
				P[8][len] = ' ';P[8][len+1] = ' ';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '5'){
				P[0][len] = '*';P[0][len+1] = '*';P[0][len+2] = '*';
				P[2][len] = '*';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				P[6][len] = ' ';P[6][len+1] = ' ';P[6][len+2] = '*';
				P[8][len] = '*';P[8][len+1] = '*';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '6'){
				P[0][len] = '*';P[0][len+1] = '*';P[0][len+2] = '*';
				P[2][len] = '*';P[2][len+1] = ' ';P[2][len+2] = ' ';
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				P[6][len] = '*';P[6][len+1] = ' ';P[6][len+2] = '*';
				P[8][len] = '*';P[8][len+1] = '*';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '7'){
				P[0][len] = '*';P[0][len+1] = '*';P[0][len+2] = '*';
				P[2][len] = ' ';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = ' ';P[4][len+1] = ' ';P[4][len+2] = '*';
				P[6][len] = ' ';P[6][len+1] = ' ';P[6][len+2] = '*';
				P[8][len] = ' ';P[8][len+1] = ' ';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '8'){
				P[0][len] = '*';P[0][len+1] = '*';P[0][len+2] = '*';
				P[2][len] = '*';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				P[6][len] = '*';P[6][len+1] = ' ';P[6][len+2] = '*';
				P[8][len] = '*';P[8][len+1] = '*';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '9'){
				P[0][len] = '*';P[0][len+1] = '*';P[0][len+2] = '*';
				P[2][len] = '*';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				P[6][len] = ' ';P[6][len+1] = ' ';P[6][len+2] = '*';
				P[8][len] = '*';P[8][len+1] = '*';P[8][len+2] = '*';
				len = len+5;
			}
			else if(cur == '+'){
				P[2][len+1] = '*';
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				P[6][len+1] = '*';
				len = len+5;
			}
			else if(cur == '-'){
				P[4][len] = '*';P[4][len+1] = '*';P[4][len+2] = '*';
				len = len+5;
			}
			else if(cur == '*'){
				P[2][len] = '*';P[2][len+1] = ' ';P[2][len+2] = '*';
				P[4][len] = ' ';P[4][len+1] = '*';P[4][len+2] = ' ';
				P[6][len] = '*';P[6][len+1] = ' ';P[6][len+2] = '*';

				len = len+5;
			}
			else if(cur == '='){
				P[2][len] = '*';P[2][len+1] = '*';P[2][len+2] = '*';P[2][len+3] = '*';
				P[6][len] = '*';P[6][len+1] = '*';P[6][len+2] = '*';P[6][len+3] = '*';
				len = len+6;
			}		
		}
		for(int i = 0;i<9;i++){
			for(int j = 0;j< len;j++)
			{
				System.out.print(P[i][j]);
			}
			System.out.println();
		}
	
	}
}
