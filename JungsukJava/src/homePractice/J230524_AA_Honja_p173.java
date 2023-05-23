package homePractice;

public class J230524_AA_Honja_p173 {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철"; //자바에서 동일한 문자열 리터럴은 하나의 객체에 저장된다.
		
		if(strVar1 == strVar2) {  //즉 두 문자열은 참조가 같다.
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} 
		
		String strVar3 = new String( "신민철");// 단순히 문자열 리터럴이 아닌 문자열 객체를 만든거라서 서로 참조가 다르다
		String strVar4 = new String( "신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} 
		
		String strVar5;
		strVar5 =null;
		System.out.println(strVar5);
		
	}

}
