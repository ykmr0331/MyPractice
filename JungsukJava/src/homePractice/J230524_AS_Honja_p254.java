//매개변수의 개수를 모를 경우2
package homePractice;

public class J230524_AS_Honja_p254 {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2 :" + result2);
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 :" + result3);

		int result4= myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 :" + result4);
	}

}
