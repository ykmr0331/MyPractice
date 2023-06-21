import java.util.Date;

public class ControlSleepThread extends Thread{
	private boolean isPlay;
	public ControlSleepThread() {
		isPlay=true;
	}
	@Override
	public void run() {
		while(isPlay) {
			try {
				//System.out.println(Thread.currentThread().getName()+"--> 1초마다 1번씩 시간출력");
				Date now=new Date();
				System.out.println(now.toLocaleString());
				/*
				 * 현재실행되고있는 쓰레드를 1000ms동안 실행중지
				 */
				Thread.sleep(1);
				
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		return;
	}
}