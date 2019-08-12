package lyf.thread2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo6_Callable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService poor = Executors.newFixedThreadPool(2);
		// ���̷߳Ž������ﲢִ��
		Future<Integer> f1= poor.submit(new MyCallable(100));
		Future<Integer> f2=poor.submit(new MyCallable(50));
		// �ر��̳߳�
		poor.shutdown();
		System.out.println(f1.get());
		System.out.println(f2.get());
	}
}

class MyCallable implements Callable<Integer> {

	private int num;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

}