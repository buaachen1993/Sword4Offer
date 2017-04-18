package Toutiao;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main3 {
	public static void main(String[] args) throws ScriptException {
	      ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");
	        String str = "1+2";
	            Double d = (Double) se.eval(str);
	            System.out.println(d);
	}
}
