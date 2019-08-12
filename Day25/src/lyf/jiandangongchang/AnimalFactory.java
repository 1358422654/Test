package lyf.jiandangongchang;

public class AnimalFactory {
	/*
	 * public static Dog createDog() { return new Dog(); }
	 * 
	 * public static Cat createCat() { return new Cat(); }
	 */

	// ���ַ����ᶨ��ܶ࣬��
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
