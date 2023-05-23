package homePractice;

public class J230523_AI_Honja_p143_1 {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;   //8~11의 임의의 정수 뽑기  
		System.out.println("[현재 시각: " + time + "시]");
	
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다..");
		case 10:
			System.out.println("업무를 봅니다..");
		default:
			System.out.println("외근을 나갑니다..");
		}
	
	
	}

}
