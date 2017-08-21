package P29_MoreThanHalfNum;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null||array.length == 0)
        	return 0;
    	int major = array[0];
        int count = 1;
        for(int i = 0;i<array.length;i++){
        	if(count ==0){
        		major = array[i];
        		count = 1;
        	}
        	else if(array[i] != major)
        		count--;
        	else
        		count++;
        }
        count = 0;
        for(int i = 0;i<array.length;i++){
        	if(array[i] == major)
        		count++;
        }
        if(count > array.length/2)
        	return major;
        else
        	return 0;
    }
}
