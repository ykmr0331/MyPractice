
public class J230524_01_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * class 선언
 *  - 형식
 *       접근제한자  class  클래스이름{ //클래스이름 첫글자 대문자임
 *       	- 접근제한자:public,protected,없는거
 *       
 *       } 
 *       ex > public class Car{
 *           }
 *           
 *  -구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,proected,없는거,private) 타입 indentifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(인자){
 *           -인자: 나를 호출한놈이 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한놈에게 줄 데이타타입 
 *                     void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */


/*
 * 1. 주차장에서 차객체를 생성할클래스(틀)
 * 2. Car객체의 주소를 저장할수있는 타입 
 */

class Car {

	/*
	 * 클래스의 구성요소
	 * 	1.멤버필드(변수)[속성]: 차객체의 속성데이타를 저장할 변수
	 *  2.멤버메쏘드[기능]    : 차객체가 외부에제공하는기능
	 */
	
	
	/*
	 * 멤버필드(변수)[속성]
	 */
	String no;	    // 차량번호
	int inTime; 	// 입차시간
	int outTime; 	// 출차시간
	int fee; 		//주차요금
}
