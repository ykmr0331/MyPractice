package J230608_09_01_06;
//중첩인터페이스
public class Button {
	OnClickListener listener; // 인터페이스 OnClickListener 타입 필드
				//. 이 필드는 외부에서 OnClickListener인터페이스를 구현한 객체를 할당받아서 사용할 것입니다.	
	
	void setOnClickListener(OnClickListener listener) {//매개변수의 다형성
		/*매개변수로 받은 OnClickListener 객체를 필드에 할당하는 메서드입니다.
		 *  다형성을 이용하여 다양한 구현 객체를 전달할 수 있습니다.*/
		this.listener = listener; 
	}
	
	void touch() { 
		listener.onClick(); // <--- OnClickListener 구현객체의 onClick()메소드 호출
	}
	
	
	//중첩인터페이스임: 바깥클래스 내부에서만 사용가능한 인터페이스
	static interface OnClickListener {//OnClickListener 중첩 인터페이스를 선언합니다.
		void onClick();				  
	}								  
}
