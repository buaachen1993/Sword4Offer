package P30_KLeastNumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

    		ArrayList<Integer> result = new ArrayList<Integer>();
    		int length = input.length;
    		if(k > length || k == 0){
    			return result;
    		}
    		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
    				return o2.compareTo(o1);
				}
			});
    		//维护一个代表最小值的容器
   
    		for (int i = 0; i < length; i++) {
    			if (maxHeap.size() != k) {
    				maxHeap.offer(input[i]);
    			} else if (maxHeap.peek() > input[i]) {
    				Integer temp = maxHeap.poll();
    				temp = null;
    				maxHeap.offer(input[i]);
    			}
    		}
    		for (Integer integer : maxHeap) {
    			result.add(integer);
    		}
    		return result;
    }       
}

