package P28_StringPermutation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StringPermutation {
		public ArrayList<String> Permutation(String str) {
			ArrayList<String> re = new ArrayList<String>();
			if(str == null || str.length() == 0)
				return re;
			//用于去重
			HashSet<String> set = new HashSet<>();
		    getPermutation(set,str.toCharArray(),0);
			re.addAll(set);
			Collections.sort(re);
			return re;
		}
		public void getPermutation(HashSet<String> set,char[] array,int index){
			if(index == array.length){
				set.add(new String(array));
				return;
			}
			for(int i = index;i<array.length;i++){
				swap(array,i,index);
				getPermutation(set,array,index+1);
				swap(array,i,index);
			}
		}
		void swap(char[] str, int i, int j) {
			if (i != j) {
				char t = str[i];
				str[i] = str[j];
				str[j] = t;
			}
		}
}
