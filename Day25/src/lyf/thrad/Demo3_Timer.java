package lyf.thrad;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {
	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask(), new Date(188,6,1,14,20,30));
	    while (true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}
}

class MyTimerTask extends TimerTask {

	@Override
	public void run() {

		System.out.println("Æð´²±³µ¥´Ê");
	}
}