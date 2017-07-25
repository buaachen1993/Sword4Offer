package P22_IsPopOrder;

public class test {
	public static void main(String args[]){
		int [] pushA = {1,2,3,4,5};
		int [] popA = {4,5,3,2,1};
		IsPopOrder test = new IsPopOrder();
		System.out.println(test.IsPopOrder(pushA, popA));
	}

}
