package lyf.thread2;

public class Demo1_Notify {
	/**
	 * 等待唤醒机制
	 */
	public static void main(String[] args) {
		 Printer p = new Printer();
		new Thread() {
			public void run() {
				while (true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while (true) {
					p.print2();
				}
			}
		}.start();
		
	}
}

class Printer {
   private int flag=1;
	public void print1() throws InterruptedException {
		// 同步代码块,锁对象可以是任意的
		synchronized (this) {
			if (flag!=1) {
				this.wait();
			}
			System.out.println("黑");
			System.out.println("马");
			System.out.println("程");
			System.out.println("序");
			System.out.println("员");
			flag=2;
			//随机唤醒单个等待的线程
			this.notify();
		}
	}

	public void print2() throws InterruptedException {
		synchronized (this) {
			if (flag!=2) {
				this.wait();
			}
			System.out.println("传");
			System.out.println("智");
			System.out.println("播");
			System.out.println("客");
			flag=1;
			this.notify();
		}
	}
}

class Demo {
}