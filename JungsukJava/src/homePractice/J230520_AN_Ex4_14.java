package homePractice;
import java.util.*; //java.util패키지에 있는거를 사용하려는거 같은데 *는 솔직히 모르겠음
						// ?? java.util 패키지에서 모든 클래스를 사용하기 위해 import java.util.*; 구문을 사용합니다. 
						// ??  *는 와일드카드(import wildcard)로, 해당 패키지의 모든 클래스를 import하라는 의미입니다.

public class J230520_AN_Ex4_14 {

	public static void main(String[] args) {
		int num = 0, sum = 0;//변수 num과 sum을 선언하고 동시에 데이터 대입
		System.out.println("숫자를 입력하세요.(예:12345)>");
		
		Scanner scanner = new Scanner(System.in);//키보드로부터 데이터를 입력받기 위해 Scanner객체를 생성한다.
		String tmp = scanner.nextLine(); // Scanner클래스를 활용해서 키보드로부터 받은 데이터를 변수 tmp에 대입한다. 이거 정확히 모르겠어 
										 // ??  nextLine()은 키보드로부터 입력받은 데이터를 문자열로 읽어들이는거다.
		num = Integer.parseInt(tmp);// 변수 tmp의 리터럴 데이터를 integer형 변수 num에 대입한다.
		
		while( num !=0) { //while반복문을 실행하는데 변수 num이 0이 아니라면 반복문을 수행한다.
			sum += num%10; //변수 sum에 변수num을 10으로 나눴을 때의 나머지를 더한다.
			System.out.printf("sum=%3d num=%d%n", sum, num);//형식지정자를 이용해서 sum의 값과 num의 값을 출력한다.
			
			num/=10;//num은 integer형이므로 num이 10으로 나눠지면서 소수점 자리수는 없어진다. 
		}
		System.out.println("각 자리 수의 합:" +sum);

	}

}
