package lyf.thread2;

public class Demo1_Notify {
	/**
	 * �ȴ����ѻ���
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
		// ͬ�������,����������������
		synchronized (this) {
			if (flag!=1) {
				this.wait();
			}
			System.out.println("��");
			System.out.println("��");
			System.out.println("��");
			System.out.println("��");
			System.out.println("Ա");
			flag=2;
			//������ѵ����ȴ����߳�
			this.notify();
		}
	}

	public void print2() throws InterruptedException {
		synchronized (this) {
			if (flag!=2) {
				this.wait();
			}
			System.out.println("��");
			System.out.println("��");
			System.out.println("��");
			System.out.println("��");
			flag=1;
			this.notify();
		}
	}
}

class Demo {
}