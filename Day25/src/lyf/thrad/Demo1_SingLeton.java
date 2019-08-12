package lyf.thrad;

public class Demo1_SingLeton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println();
	}
}

/**
 * ����ʽ
 */
/*
 * class Singleton { 
 * // 1.˽�й��췽��,�����಻�ܷ��ʸù��췽��
 *  private Singleton() { }
 * //2.��Ա����˽�У�����ͨ�����������
 *  private static Singleton s=new Singleton();
 * //3.�����ṩ�����ķ��ʷ��� getInstance��ȡʵ��������
 *  public static Singleton getInstance() {
 * return s; } }
 */

class Singleton {
	// 1.˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {
	}

	// 2.��Ա����˽�У�����ͨ�����������
	private static Singleton s;

	// 3.�����ṩ�����ķ��ʷ��� getInstance��ȡʵ��������
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
}