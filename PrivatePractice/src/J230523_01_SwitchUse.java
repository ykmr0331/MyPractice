
public class J230523_01_SwitchUse {

	public static void main(String[] args) {
		
		/*
		 * 짝수 홀수 판별
		 */
		int num = 22;
		
		switch(num%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;

		}
		/*
		 * 1~6사이의 정수
		 */
		int diceNo = (int)(Math.random() * 6) + 1; //
		
		switch(diceNo) {
		case 1:
			System.out.println("dice number :" + diceNo);
			break;
		case 2:
			System.out.println("dice number :" + diceNo);
			break;
		case 3:
			System.out.println("dice number :" + diceNo);
			break;
		case 4:
			System.out.println("dice number :" + diceNo);
			break;
		case 5:
			System.out.println("dice number :" + diceNo);
			break;
		case 6:
			System.out.println("dice number :" + diceNo);
			break;					
		}
		/*
		 * 입력되는 키보드 문자열에 따라 게임캐릭터이동 
		 */
		char direction = 'A';
		
		switch(direction) { // 게임시 키보드로 방향키 입력하는 것을 switch로 나타냄
		case 'A':
		case 'a':
			System.out.println("move left~");
			break;
		case 'W':
		case 'w':
			System.out.println("move up~");
			break;
		case 'D':
		case 'd':
			System.out.println("move right~");
			break;
		case 'X':
		case 'x':
			System.out.println("move down~");
			break;
		case 'S':
		case 's':
			System.out.println("move rotate~");
			break;
		default:
			System.out.println("don't move~");
			break;
		}
		/*
		 * Quiz: 대소문자 구분없이 실행되도록해보세요		com.itwill00.variable
		 */
	}

}
