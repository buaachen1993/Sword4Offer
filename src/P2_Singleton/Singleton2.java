package P2_Singleton;
/***
 * 线程安全的方法
 * @author chandler
 * 理解final关键字
 */
public class Singleton2 {
	//直接创建一个实例对象
	private final static Singleton2 singleton = new Singleton2();
	private Singleton2(){
		
	}
	public static Singleton2 getInstance(){
		return singleton;
	}
}
