
/*
 * 클래스의 구성요소
 *   1.멤버필드(변수)[속성]:객체생성시 속성데이타를 저장할변수
 *   2.멤버메쏘드
 */
public class MemberMethod {
		int member1;
		
		void method1() { //void는 무효라는 뜻
			System.out.println(" \t -- void method()실행시작---");
			System.out.println(" \t method stmt1");
			System.out.println(" \t method stmt2");
			System.out.println(" \t -- void method()실행끝  ---");
		
		}
		/*
		 * <<  return  >>
		 * -모든 메소드 블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환해야한다.
		 * -실행흐름을 호출한 곳으로 반환하는 문장이 return문이다.
		 * -return문을 만나면 실행흐름이 호출한 곳으로 반환된다.
		 * -return 타입이 void인 경우에는 생략이 가능하다.
		 * -return문이 생략된 경우에는 컴파일러가 자동으로 return문을 삽입하여 준다.
		 */
		
		
		void method2() {  //실행흐름만 반환함, 줄 데이터가 업어서
			System.out.println(" \t -- void method2()실행시작---");
			System.out.println(" \t method2 stmt1");
			System.out.println(" \t method2 stmt2");
			System.out.println(" \t -- void method2()실행끝  ---");
			return; //안써도됌 ㅡ    
		}
		//************************매개변수(파라메타)가 있는 메서드 정의***************************
		void method3(int count) { // 매개변수는 변수의 선언형태를 가짐
			System.out.println("\t--- void method3(int count) --- 실행");
			int localVariable1 = 888;
			
			boolean localVariable2 = false;			
		
			System.out.println("\t method3 메소드블록 안에 선언된 로컬변수1: " +localVariable1);			
			System.out.println("\t method3 메소드블록 안에 선언된 로컬변수2: "+localVariable2);
			for(int i =0; i < count; i++) {
				System.out.println("\t void method3(int count)실행: 매개변수(파라메타) count값-->" + count);
			}
			System.out.println("\t void method3(int count)실행: 매개변수(파라메타) count값-->" + count);
			
			System.out.println("\t--- void method3() --- 실행 후 실행 흐름 반환");
			return;
		}
		
		void method4(String msg, int count) { // 이걸 메소드의 정의라고 한다.
			System.out.println("\t--- void method4(String msg, int count) --- 실행");
			for(int i =0; i < count; i++) {
				System.out.println("\t\t" +msg);
			}
			System.out.println("\t--- void method4(String msg, int count) --- 종료후 실행흐름반환");
			return;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
