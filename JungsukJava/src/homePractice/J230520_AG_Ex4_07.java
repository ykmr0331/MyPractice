package homePractice;

public class J230520_AG_Ex4_07 {

	public static void main(String[] args) {
		int num = 0; // int형 변수 num 선언과 동시에 데이터 대입
		
		for(int i = 1; i <=5; i++) { //for문과 Math.random()메소드를 이용해서 정수 1~6사이의 임의의 수 5개를 출력
			num = (int) (Math.random()*6) + 1;
			System.out.println(num); 
		}

	}

}
