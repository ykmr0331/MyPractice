package homePractice;

public class J230523_AO_Honja_p152_2 {

	public static void main(String[] args) {
		for(float x =0.1f; x <=1.0f; x +=0.1f) {
			System.out.println(x);
		}
		//0.1을 float타입으로 정확하게 표현할 수 없기 때문에 루프카운터 변수 x에 더해지는 실제 값은 0.1보다 약간 크다 이해함?
	}

}
