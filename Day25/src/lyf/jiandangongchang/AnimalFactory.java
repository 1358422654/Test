package lyf.jiandangongchang;

public class AnimalFactory {
	/*
	 * public static Dog createDog() { return new Dog(); }
	 * 
	 * public static Cat createCat() { return new Cat(); }
	 */

	// 发现方法会定义很多，，
	public static Animal createAnima(String name) {
		if ("dog".equals(name)) {
			return new Dog();
		}else if ("cat".equals(name)) {
			return new Cat();
		}else {
			return null;
		}
	}
}
