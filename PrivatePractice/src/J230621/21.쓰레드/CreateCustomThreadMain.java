/*	
type A:
1. Thread 클래스를 상속받는다.
2. Thread class의 run method를 overriding 한다.
	동사원형:public void run()
3. Thread 객체를 생성한다.
4. Thread 객체를통해서 Thread를 시작시킨다.
*/
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main thread start");
		//싱글 코어 프로세서에서는 두 쓰레드가 동시에 실행되지 않습니다
		createCustomThread cct = new createCustomThread(); 
		cct.setName("사용자정의쓰레드");
		System.out.println("2.main thread createCustomThread객체.start()메쏘드 호출 전 ");
		
		cct.start(); /* cct.start();를 호출하면 createCustomThread 클래스의 run 메소드가 실행되는 새로운 쓰레드가 생성됩니다.
		 				이 쓰레드는 메인 쓰레드와 별개로 동작합니다. 
		 				따라서 이 코드를 실행하면 메인 쓰레드와 "사용자정의쓰레드"라는 이름의 새로운 쓰레드가 동시에 실행됩니다.*/
		System.out.println("3.main thread createCustomThread객체.start()메쏘드 호출 후 ");
		int i =0;
		while(i<100) {	
			System.out.println("4.main thread " + i);
			i++;
		}
		
		
		
		
		
		
		
		
	}

}
