
public class ControlPriorityMain {

	public static void main(String[] args) {
		/*
		 *priority(우선순위) 
		*/
		ConCurrentBeepThread bt = new ConCurrentBeepThread();
		ConCurrentPrintThread pt = new ConCurrentPrintThread();
		
		/* setPriority() 메서드는 스레드의 우선순위를 설정합니다. 
		 * 우선순위는 1에서 10까지의 값으로 설정할 수 있으며, 숫자가 클수록 우선순위가 높습니다.
		 *  우선순위가 높은 스레드는 우선순위가 낮은 스레드보다 먼저 실행됩니다.*/
	
		bt.setPriority(10);
		pt.setPriority(1);
		bt.start();
		pt.start();
		 
	}

}
