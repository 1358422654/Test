package lyf.thread2;

public class Demo4_ThreadGroup {
public static void main(String[] args) {
	//demo1();
	
	ThreadGroup tg=new ThreadGroup("����һ���µ��߳���");
	MyRunnable mr=new MyRunnable();
	Thread t1=new Thread(tg,mr,"����");
	Thread t2=new Thread(tg,mr,"����");
	
	System.out.println(t1.getThreadGroup().getName());
	System.out.println(t2.getThreadGroup().getName());
}

private static void demo1() {
	MyRunnable mr=new MyRunnable();
	Thread t1=new Thread(mr,"����");
	Thread t2=new Thread(mr,"����");
	ThreadGroup tg1=t1.getThreadGroup();
	ThreadGroup tg2=t2.getThreadGroup();
	
	//Ĭ�������߳�
	System.out.println(tg1.getName());
	System.out.println(tg2.getName());
}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
	for (int i = 0; i < 1000; i++) {
		System.out.println(Thread.currentThread().getName()+"...."+i);
	}
	}
	
}