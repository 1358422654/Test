package lyf.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5_Executors {
	public static void main(String[] args) {
		//�����̳߳�
     ExecutorService poor=Executors.newFixedThreadPool(2);
     //���̷߳Ž������ﲢִ��
     poor.submit(new MyRunnable());
     poor.submit(new MyRunnable());
     //�ر��̳߳�
     poor.shutdown();
     
	}
}
