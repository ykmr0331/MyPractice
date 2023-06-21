
public class MainThreadCalled {
	public void main_thread_called_method1() {
		System.out.println("\tA."+Thread.currentThread().getName()+ "쓰레드실행");
		System.out.println("\tB."+Thread.currentThread().getName()+ "쓰레드반환");
		return;
	}
	
	public void main_thread_called_method2() {
		System.out.println("\t가."+Thread.currentThread().getName()+ "쓰레드실행");
		System.out.println("\t나."+Thread.currentThread().getName()+ "쓰레드반환");
		return;
	}
}
