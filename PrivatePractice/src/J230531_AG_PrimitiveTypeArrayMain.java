/*
 배열:  
      - 같은데이타 
		  3.길이가 고정되어있다. 
		 
 */
public class J230531_AG_PrimitiveTypeArrayMain {
	
	public static void main(String args[]) {
		int intType;
		intType = 90;
//		int[] intArray; // 여기 []배열이 붙는 순간 객체임. intArray는 참조변수가 되는거임
		
		
		int[] intArray; // 일단 참조변수 선언
		
		intArray = new int[5]; // 그리고 new( 생성자 선언하기전에 하는거)쓰고
								 //	타입 int[]쓴다. 
                                 //	마지막으로 배열[]의 크기를 정해준다.
	
		System.out.println("intArray의 주소값: " + intArray);
		
		
		
		
		
		intArray[0] = 45; // intArray까지는 배열타입, intArray[0] 은 integer타입
		intArray[1] = 78;
		intArray[2] = 56;
		intArray[3] = 13;
		intArray[4] = 81;
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ출력ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		
		/*
		 * 모든 배열객체는 public int length;를 멤버변수로 가진다.
		 * 정확히는 밑에 얘기임
		 * 모든 배열 객체는 public으로 선언된 length라는 int 타입의 멤버 변수를 가지고 있습니다. 
		 */
		System.out.println("배열객체의 멤버필드갯수:" + intArray.length); //  length는 배열 객체의 길이를 나타내는 멤버 필드
		
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ[for문]출력ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(int i =0; i < intArray.length; i++ ) {
			System.out.println("intArray["+i+"] ==>>" +intArray[i]);
		}
		
		
		System.out.println("-------------기본형 1차원 배열-------------"); // 기본형 타입을 멤버로 갖는 1차원 배열타입
		
		System.out.println("-------------int[]-------------");
		int[] korArray =new int[10];//0부터 9까지 배열의 요소가 있는거다
		korArray[0] = 89;
		korArray[1] = 56;
		korArray[2] = 99;
		korArray[3] = 78;
		korArray[4] = 10;
		korArray[5] = 100;
		korArray[6] = 23;
		korArray[7] = 71;
		korArray[8] = 65;
		korArray[9] = 29;
		
		int korTot =0;
		
		for(int i =0; i < korArray.length; i++) {
			korTot += korArray[i]; 
		}
		System.out.println("우리반 국어 총점: " +korTot);
		System.out.println("우리반 국어 평균점: " +korTot/(double)korArray.length);
		

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡchar[]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		char[] ca = new char[6];//생성된 배열 객체의 멤버타입이 char이고 객체의 타입은 배열객체다. 
		ca[0] ='H';
		ca[1] ='e';
		ca[2] ='l';
		ca[3] ='l';
		ca[4] ='o';
		ca[5] ='!';
		for (int i = 0; i < ca.length; i++) {// for입력하고 ctrl + space하고 위에서 두번째꺼 선택하면 이거 나옴
			System.out.print(ca[i] + " ");
		}
		
		System.out.println();
		
		
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡboolean[]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		boolean[] ba=new boolean[5];
		
		ba[0] =true;
		ba[1] =false;
		ba[2] =true;
		ba[3] =false;
		ba[4] =true;
		
		int trueCount = 0;
		
		for(int i =0; i < ba.length; i++) { 
			if(ba[i]) {// 배열객체 ba[]의 멤버값이 true인 것을 찾아
				trueCount++;
			}
		}
		
		System.out.println("true count: " + trueCount);
		System.out.println("false count: " + (ba.length - trueCount));
		
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡString[]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		String[] strArray = new String[5];
		
		strArray[0] ="KIM";
		strArray[1] ="LEE";
		strArray[2] ="SIM";
		strArray[3] ="CHOI";
		strArray[4] ="PARK";
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
			
		}	
	}
	
}
