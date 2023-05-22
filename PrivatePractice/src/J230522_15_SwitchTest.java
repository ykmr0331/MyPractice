
public class J230522_15_SwitchTest {

	public static void main(String[] args) {

		int level = 3; // 게임레벨 1~5사이의 정수

		switch (level) {
		case 1: //case값은 리터럴 상수
			/*명령문 위치*/
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			/*
			 * break --> switch block을 빠져나간다.
			 */
			break;
		case 2:
			System.out.println("중수");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("고수[3,4,5]");
			break;
		
		default:
			System.out.println("레벨은 1~5사이의 정수입니다.");
			break;
		}
	}

}
