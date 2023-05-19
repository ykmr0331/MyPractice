
public class J230519_04_VariableTypes {

	public static void main(String[] args) {
		/*
		 * 논리형
		 *  1.논리형 변수타입(boolean)
		 *  	boolean b1;
		 *  	boolean b2;
		 *  	-논리형 변수	: b1, b2
		 *  	-논리형 리터럴	: true, false 	
		 */
		boolean bool1;
		boolean bool2;
		boolean bool3;
		boolean bool4;
		bool1 =true;
		bool2 =false;
		bool3 = true;
		bool4 = bool3;// 
		System.out.println("------boolean------");
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);

//		true =false;
//		좌변이 변수여야한다. ture는 상수라할 수 있다.

		
		
		/*
		 *숫자형
		 *
		 * 1.정수형변수(byte, short, int, long)
		 *	  - 정수형리터럴(=정수형데이터):10. 23. -90. 2343242
		 * 
		 */
		
		byte b1 = 3;
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0b01111111;
		int i =3;
		
//	byte b5 = i;
//Type mismatch: cannot convert from int to byte
		
		System.out.println("-------byte------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println("-------short------");
		short s1 = 734;
		short s2 = -32768;
		short s3 = 32767;
		short s4 =  0b0111111111111111;
//		short s5 =  32768;
//		Type mismatch: cannot convert from int to short
		
		i = 734;
		System.out.println(i);
		
//		short s6 = i;
//		Type mismatch: cannot convert from int to short
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		int i1, i2, i3, i4, i5, i6;
		i1 = 88;
		i2 = 99;
		i3 = 2147483647;
		i4 = 0b011111111111111111111111111111111;
		i5 = i1;
		i6 = i2;
		
		System.out.println("-------int ------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);

		long l1 = 232;
		/*
		 The literal 2147483648 of type int is out of range
		 */
		long l2 = 2147483648L;
		System.out.println(l1);
		System.out.println(l2);
		
		/*실수형
		 *
		 * 2.실수형변수(float, double)
		 *	 		float avg;
		 *			double height;  
		 *
		 *		-실수형 변수: avg, height
		 *		-실수형 리터럴: 1.23, 78.25, 100.0 (double)
		 */
		
		float f1, f2, f3;
		f1 = 0.1f;
		f2 =3.14f;
		f3 =10000.0F;
		System.out.println("------float-------");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		double d1, d2, d3;
		d1= 3.141592;
		d2= 12345678912345678912345678.0;
		d3= 1.2345678912345678912345678;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
			
		
	}
	

}
