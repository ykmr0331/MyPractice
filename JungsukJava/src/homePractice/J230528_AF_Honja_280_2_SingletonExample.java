// 싱글톤 객체
package homePractice;

public class J230528_AF_Honja_280_2_SingletonExample {




	public static void main(String args[]) {
		 /*
		    singleton obj1 = new Singleton(); // ?? Singleton 클래스의 생성자가 private으로 선언되어 있기 때문에 외부에서 직접 객체를 생성할 수 없습니다.
		    singleton obj2 = new Singleton(); // 이렇게 하면 컴파일 에러난다
		  */
		
		J230528_AE_Honja_280_1_Singleton obj1 = J230528_AE_Honja_280_1_Singleton.getInstance();
		J230528_AE_Honja_280_1_Singleton obj2 = J230528_AE_Honja_280_1_Singleton.getInstance();
		
		if(obj1 == obj2) {// 싱글톤 패턴에서는 단일 객체를 공유하기 때문에 obj1과 obj2는 같은 객체를 참조하게 됩니다
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}
}