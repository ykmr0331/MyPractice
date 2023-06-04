package J230604_08_01_02;
//상수필드 선언
public interface RemoteControl {//일단 인터페이스 선언은 이렇게하면 된다.
	public int MAX_VOLUME = 10; /*인터페이스는 객체 사용방법을 정의한 것이므로
	 							  실행시 데이터를 저장할 수 있는 인스턴스필드나 정적필드를 선언할 수 없다.
								  그러나 상수필드는 선언 가능*/
	public int MIN_VOLUME = 0; 
}
