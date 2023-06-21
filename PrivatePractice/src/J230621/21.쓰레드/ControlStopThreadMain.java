	
	public class ControlStopThreadMain {
	
		public static void main(String[] args) throws Exception{
			System.out.println("1.main");
			/*
			ControlStopThread1 cst1 = new ControlStopThread1();
			cst1.setName("download thread");
			cst1.start();
			*/
			ControlStopThread2 cst2 = new ControlStopThread2();
			cst2.start();
			Thread.sleep(5000);
			//cst2.stop(); 이렇게하면 안되고
			cst2.setPlay(false); // ControlStopThread2에서 run()메소드를 봐라
			System.out.println("9.main end");
		}
	
	}
