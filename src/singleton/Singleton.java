package singleton;

/**
 * 多线程下的懒汉式单例模式,只有用到实例时才创建
 * @author Jeff
 *
 */
public class Singleton {
	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
