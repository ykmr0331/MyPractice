//메소드 호출

package homePractice;

public class J230524_AQ_Honja_p251 {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); /* Calculator클래스의 참조변수 myCalc를 생성해 
		Calculator객체를 생성하고 객체의 주소값을 참조변수 myCalc에 저장 */

		
		myCalc.powerOn(); // 참조변수 myCalc를 이용해서 Calculator객체에 있는 powerOn()메서드를 호출

		int result1 = myCalc.plus(5,6); 
		// ?? 참조변수 myCalc를 이용해서 Calculator 객체의 plus() 메소드를 호출하고, 인자로 5와 6을 전달하여 덧셈을 수행한 결과를 result1 변수에 저장합니다.
		System.out.println("result1: " + result1);
		

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2: " + result2);
		myCalc.powerOff();
	}

}

