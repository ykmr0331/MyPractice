
public class J230522_08_IfTest1 {
	/*
	 * 코드 정렬: ctrl + shift + f
	 */

	public static void main(String[] args) {
		System.out.println("main block start");
		System.out.println("stmt1");
		boolean condition = true;

		if (condition) {
			/*
			 * true 일 때 실행 블록
			 */
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		}
		System.out.println("stmt5");
		if (condition) {
			/*
			 * true일 때 실행블록
			 */
			System.out.println("stmt6");
			System.out.println("stmt7");
		} else {
			/*
			 * false일 때 실행블록
			 */
			System.out.println("stmt8");
			System.out.println("stmt9");
		}
		System.out.println("stmt10");

		if (condition)
			System.out.println("stmt11");
		System.out.println("stmt12");

		if (condition)
			System.out.println("stmt13");
		else
			System.out.println("stmt14");
		System.out.println("stmt15"); //14와 15는 관계없음 (14는 false일 때, 15는 if문 밖임)

		System.out.println("main block end");
		return;
		
		/*
		 * return; -현재 return문을 실행하는 실행흐름을 호출한곳으로 반환한다. -return 문 생략가능
		 */

//		System.out.println("sfdsesdf");  
//		메인메서드 리턴 적고 그 밖에 뭐 적으면  unreachable code라는 컴파일 에러남

	}// 실행(메서드)의 흐름이 main 으로 되돌아가면 종료된다.\

}
