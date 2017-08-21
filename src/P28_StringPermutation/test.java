package P28_StringPermutation;

import java.util.ArrayList;

public class test {
	public static void main(String args[]){
		String str = "a";
		ArrayList<String> re = new ArrayList<String>();
		StringPermutation test = new StringPermutation();
		re = test.Permutation(str);
		System.out.println(re.get(0));
	}
}
