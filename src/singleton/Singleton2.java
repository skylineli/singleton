package singleton;

/**
 * 恶汉式单例模式
 * @author Jeff
 *
 */
public class Singleton2 {

	private static Singleton2 instance = new Singleton2();
	
	private Singleton2(){
		
	}
	
	public static Singleton2 getInstance(){
		return instance;
	}
}
