//final 필드 선언과 초기화
package homePractice;

public class J230528_AG_Honja_281_Person {




	final String nation = "Korea"; //nation 필드는 final 키워드로 선언되어 있어 한 번 초기화되면 변경할 수 없는 상수입니다
									//상수가 꼭 숫자를 의미하는 것은 아니다.
	
	final String ssn;				// ssn필드는 주민등록번호인데 final키워드로 선언되었다. 
									//	다른 Person객체를 생성할 때 주민번호가 달라지므로 선언만하고 초기화는 안함
									//final키워드로 선언됐으므로 나중에 초기화하면 변경 불가
	
	String name;					// 
	
	public J230528_AG_Honja_281_Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}
}