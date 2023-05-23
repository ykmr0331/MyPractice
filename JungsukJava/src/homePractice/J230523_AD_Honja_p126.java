package homePractice;

public class J230523_AD_Honja_p126 {

	public static void main(String[] args) {
		int score = 85;
		char grade =(score > 90) ? 'A': ((score >80 ? 'B' : 'C')); //삼항연산자를 이중으로 쓴거다
				/* 바깥 삼항 연산자는 점수가 90이 넘으면 A고 그렇지 않을 경우 다시 삼항연산자로 간다.
				 * 안쪽 삼항연산자는 점수가 80이 넘으면 B고 그렇지 않을 경우 C다
				 */

		System.out.println(grade);
	}

}
