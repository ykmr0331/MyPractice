
public class J230523_05_WhileNested {

	public static void main(String[] args) {
		/*
		 * 
		 * ★★★★★ ★★★★★ ★★★★★ ★★★★★ ★★★★★
		 * 
		 */

		System.out.println("1.ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println();
		/*
		 * [0,0]*[0,1]*[0,2]*[0,3]*[0,4] [1,0]*[1,1]*[1,2]*[1,3]*[1,4]
		 * [2,0]*[2,1]*[2,2]*[2,3]*[2,4] [3,0]*[3,1]*[3,2]*[3,3]*[3,4]
		 * [4,0]*[4,1]*[4,2]*[4,3]*[4,4]
		 */

		int i = 0;
		while (i < 5) { //
			int j = 0;
			while (j < 5) { // 이 안쪽 while문이 *****를 만든다
				System.out.printf("%s[%d,%d]", "*", i, j); // 디버깅에서 i값과 j값을 알아보기 위해
				j++;
			}
			System.out.print("\n"); // *****가 만들어지면 바깥쪽 while문에서 라인건너띄기를 한다.
			i++;
		} // 바깥 while문 끝
		System.out.println();

		System.out.println("2.ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println();
		/*
		 * ☆★★★★ ★☆★★★ ★★☆★★ ★★★☆★ ★★★★☆
		 */

		i = 0;
		while (i < 5) {
			int j = 0; // 아까 위에 j는 while문 안에서 사용된거므로 없어지고 다시 선언 초기화 동시해 해줌
			while (j < 5) {
				if (i == j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
				j++;
			} // 안쪽 while문의 끝
			System.out.println();
			i++;
		} // 바깥 while문의 끝
		System.out.println();

		System.out.println("3.ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println();

		/*
		 * ☆★★★★ ☆☆★★★ ☆☆☆★★ ☆☆☆☆★ ☆☆☆☆☆
		 */

		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i <= j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
				j++;
			} // 안쪽 while문 끝
			System.out.println();
			i++;
		} // 바깥쪽 while문 끝

		System.out.println("4.[Quiz]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println();
		/*
		 * ★★★★★ ☆★★★★ ☆☆★★★ ☆☆☆★★ ☆☆☆☆★
		 */

		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i > j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
				j++;
			} // 안쪽 while문 끝
			System.out.println();
			i++;
		} // 바깥쪽 while문 끝

		System.out.println("5.ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		/*
		 * 
		 * ★ ★★ ★★★ ★★★★ ★★★★★
		 * 
		 */

		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i >= j) {
					System.out.print("★"); // 이해가 안되면 여기를 System.out.printf("[%d,%d]★",i,j);로 입력해라
				} else {
					System.out.print(" ");
				}
				j++;
			} // 안쪽 while문 끝
			System.out.println();
			i++;
		} // 바깥쪽 while문 끝

		System.out.println("6.[QUIZ]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		/*
		 * 
		 * ★★★★★ ★★★★ ★★★ ★★ ★
		 * 
		 */

		i = 0;
		while (i < 5) { // i가 5보다 작아야 i = 0 ,1, 2, 3, 4를 각각 대입가능하기에
			i++;
			int j = 5;
			while (j > 0) { // j는 5, 4, 3, 2, 1순으로 내려와야 별표가 완성됌
				if (i <= j) { // i가 1일 때 별*5개, 2일 때 4개 , 3일 때 3개 이런 식으로
					System.out.print("*"); 									//System.out.printf("[%d,%d]★", i, j); 잘 모르면 이거 봐라

				}
				j--; // 이걸 빼줘야 다음줄에서 별표 갯수가 줄어든다. //if은 무조건 나와야되고 안쪽 while문에서 수행해야됌
			}
			System.out.println(); //안쪽 while문 벗어나서 수행해야 별표의 다음 줄이 완성된다.

		}

	}// main메서드 끝
} // 클래스의 끝
