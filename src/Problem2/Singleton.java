package Problem2;
/***
 * 面试题2 设计一个类 我们只能生成该类的一个实例
 * @author chandler
 * refer:http://haolloyin.blog.51cto.com/1177454/332469/
 * 理解构造函数 静态方法的理念 
 * 非线程安全
 */
public class Singleton {
	private static Singleton singleton = null;
	//构造函数
	private Singleton()
	{
		
	}
	//静态方法 用来创建实例
	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
}

