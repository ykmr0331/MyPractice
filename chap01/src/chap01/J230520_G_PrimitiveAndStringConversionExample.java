package chap01;

public class J230520_G_PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); //String문자열"10"을 int형 10으로 바궈서 int형 변수 value1에 대입하는것
		double value2 = Double.parseDouble("3.14"); //String문자열"3.14"을 double형으로 바꿔서 double형 변수 value2에 대입하는것
		boolean value3 = Boolean.parseBoolean("true"); //String문자열 "true"를 boolean형으로 바꿔서 boolean형 변수 value3에 대입
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);

		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
	
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	
	}

}
