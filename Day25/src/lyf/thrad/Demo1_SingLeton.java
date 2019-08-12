package lyf.thrad;

public class Demo1_SingLeton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println();
	}
}

/**
 * 饿汉式
 */
/*
 * class Singleton { 
 * // 1.私有构造方法,其他类不能访问该构造方法
 *  private Singleton() { }
 * //2.成员变量私有，不能通过类名点调用
 *  private static Singleton s=new Singleton();
 * //3.对外提供公共的访问方法 getInstance获取实例化对象
 *  public static Singleton getInstance() {
 * return s; } }
 */

class Singleton {
	// 1.私有构造方法,其他类不能访问该构造方法
	private Singleton() {
	}

	// 2.成员变量私有，不能通过类名点调用
	private static Singleton s;

	// 3.对外提供公共的访问方法 getInstance获取实例化对象
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
}