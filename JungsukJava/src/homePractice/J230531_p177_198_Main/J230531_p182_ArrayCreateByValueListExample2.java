package J230531_p177_198_Main;

public class J230531_p182_ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores; // 배열 객체 선언
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];

		}
		System.out.println("총합: " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합: " + sum2);
		System.out.println();
	} // 메인메서드 끝

	public static int add(int[] scores) { // 메소드 매개변수로 배열객체가 들어갈 수 있다!!!!!!!!!!!!!!!!!!!!!!!!!
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];

		}
		return sum;
	}

}
