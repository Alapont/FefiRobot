package main;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class main {
	public static void main(String[] args) {
		int time =(args.length==0)?150:Integer.parseInt(args[0]);
		System.out.println("using time: "+time);
		Robot r;
		try {
			r = new Robot();
			while(true) {
				System.out.println(System.currentTimeMillis()+'\n');
				r.keyPress(KeyEvent.VK_SHIFT);
				r.waitForIdle();
				r.keyRelease(KeyEvent.VK_SHIFT);
				TimeUnit.SECONDS.sleep(time);
			}
		} catch (AWTException e) {
		} catch (InterruptedException e) {
		}

	}
}