package P21_StackWithMin;

public class test {
	public static void main(String args[]){
		StackWithMin test = new StackWithMin();
		test.push(1);
		System.out.println(test.top());
		test.push(2);
		System.out.println(test.min());
		test.push(0);
		System.out.println(test.min());
		test.pop();
		System.out.println(test.min());
	}

}
