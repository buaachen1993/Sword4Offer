package souhu;

public class MajorityElement {
	public int[] getMajority(int[] number){
		int[] majority =  new int[2];
		int mCount = 0;
		int nCount = 0;
		for(int i = 0;i < number.length;i++){
			if(mCount ==0 || number[i] == majority[0])
			{
				majority[0] = number[i];
				mCount++;
			}
			else if(nCount ==0 || number[i] == majority[1])
			{
				majority[1] = number[i];
				nCount++;
			}
			else{
				mCount--;
				nCount--;
			}
		}
		System.out.println(mCount);
		System.out.println(nCount);
		System.out.println(majority[0]);
		System.out.println(majority[1]);
		return majority;
	}
	    public int MoreThanHalfNum_Solution(int [] array) {

	        if(array == null || array.length == 0){
	            return 0;
	        }

	        int result = array[0];
	        int times = 1;
	        for(int i = 1; i < array.length; i++){
	            if(times == 0){
	                result = array[i];
	                times = 1;
	            }else if(array[i] == result){
	                times++;
	            }else{
	                times--;
	            }


	        }
	        System.out.println(result);
	       // if(!CheckMoreThanHalf(array, result)){
	         //   result = 0;
	        //}
	        return result;
	    }
	   public static boolean CheckMoreThanHalf(int[] array, int number){
	        int times = 0;
	        int length = array.length;

	        for(int i = 0; i < length; i++){
	            if(array[i] == number){
	                times++;
	            }
	        }

	        boolean isMoreThanHalf = true;

	        if(times * 2 <= length){
	            isMoreThanHalf = false;
	        }

	        return isMoreThanHalf;
	    }
	

	public static void main(String args[]){
		int[] number = {1,2,3,2,4,2,5};
		MajorityElement test = new MajorityElement();
		//test.getMajority(number);
		System.out.println(test.MoreThanHalfNum_Solution(number));
		
	}
}
