
public class J230523_03_WhileUse {

	public static void main(String[] args) {
		System.out.println("---------------i=0----------------");
		int i = 0; // 반복횟수 변수 //i가 0부터인 이유는 배열의 인덱스가 0부터이기 때문
		while (i < 10) { // 0부터 9까지 출력하려고
			System.out.println("stmt:i =" + i);
			i++;
		}
		System.out.println("---------------i=1----------------");
		i = 1;
		while (i <= 10) { // i== 11이 되면 빠져나옴
			System.out.println("stmt:i=" + i);
			i++;
		}
		System.out.println(">> 1~10사이의 정수 출력(10회)");
		i = 0; // i 초기화
		while (i < 10) {
			System.out.print((i + 1) + " "); // 옆으로 출력하겠다고
			i++;
		}
		System.out.println(); // System.out.print("\n); 같은거임
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println(">> 1~10[홀수]");// i를 홀수만 출력해보기
		i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100[4의 배수]");// i를 100안 의 자연수에서 4의 배수만 출력해보기
		i = 1;
		while (i <= 100) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println();
		System.out.println("1900년에서 2023년까지 윤년을 출력");
		int year = 1900;
		while (year <= 2023) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { //  윤년의 4의 배수이지만 100의 배수는 아니다. 하지만 400의 배수다
				System.out.print(year + "\t");

			}
			year++;
		}

	
		System.out.println(" >> 1~100사이의 정수누적합");
		int tot = 0; // 누적합
		int oddTot =0; //홀수합
		int evenTot=0; //짝수합
		i = 1; // 변수 i 초기화
		
		while (i <= 100) {
			tot += i; // tot에다가 증가하는 변수 i를 더하기 //연산 후 대입연산자!!
			
			if(i%2==0) { //i가 짝수 일때는 evenTot에 더하도록
				evenTot +=i;
			} else {    //아닐때는(i가 홀수)일 때는 evenTot에 더하도록
				oddTot +=i;
			}
			i++; // 여기서 변수 i가 증가
		}
		System.out.println("1에서 100사이의 정수합: " +tot);
		System.out.println("1에서 100사이의 짝수합: " +evenTot);
		System.out.println("1에서 100사이의 홀수합: " +oddTot);
	}
}
