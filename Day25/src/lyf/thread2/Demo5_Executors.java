package lyf.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5_Executors {
	public static void main(String[] args) {
		//创建线程池
     ExecutorService poor=Executors.newFixedThreadPool(2);
     //将线程放进池子里并执行
     poor.submit(new MyRunnable());
     poor.submit(new MyRunnable());
     //关闭线程池
     poor.shutdown();
     
	}
}
