package nogeneric;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "BING", 33000, 0.3);
		Account acc2 = new Account(2222, "KING", 12000, 1.3);
		Account acc3 = new Account(3333, "YING", 89000, 5.6);
		Account acc4 = new Account(4444, "SING", 45000, 4.3);
		Account acc5 = new Account(5555, "PING", 99000, 2.9);

		ArrayList accountList = new ArrayList();// accountList는 ArrayList클래스타입~~~~~
		// , ArrayList 클래스는 Collection 인터페이스를 구현(implement)한 클래스
		// ArrayList는 List 인터페이스를 구현하고, List인터페이스는 Collection 인터페이스를 상속받고 있습니다

		int size = accountList.size();
		System.out.println("#size:" + size);

		System.out.println("----------------1. add[맨마지막 index에 객체 저장]------------------");
		// ArayList의 add() 메서드는 요소를 리스트의 끝에 추가하는 역할
		accountList.add(acc1); // acc1~5는 Account타입객체
		System.out.println("#size: " + accountList.size());
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size: " + accountList.size());
		System.out.println(accountList);
		/*
		 * system.out.println()은 객체를 출력할 때 해당 객체의 toString() 메서드를 호출하여 객체의 문자열 표현을 얻습니다.
		 * 이 문자열 표현은 객체의 내용을 나타내는 문자열입니다. 따라서, ArrayList 타입의 객체를 System.out.println()으로
		 * 출력하면 ArrayList의 toString() 메서드가 호출되어 리스트의 요소들을 나타내는 문자열을 반환합니다.
		 */
		System.out.println();
		System.out.println();

		System.out.println("----------------2. add(index,element)[지정된 index에 객체 저장]------------------");
		accountList.add(1, new Account(1112, "NEW", 30000, 3.3));
		/*
		 * add(int index, Object element) 메서드는 지정된 인덱스에 요소를 추가하는 기능을 제공합니다
		 */
		System.out.println("#size: " + accountList.size());
		System.out.println(accountList);
		System.out.println();
		System.out.println();

		System.out.println("----------------3. set(index,element)[지정된 index에 객체 저장]------------------");
		// add와 다른데 index에 집어넣으면 원래 index에 있는 객체는 없어진다.
		accountList.set(accountList.size() - 1, new Account(9999, "NINE", 90000, 9.9));
		System.out.println("#size: " + accountList.size());
		System.out.println(accountList);
		System.out.println();
		System.out.println();

		System.out.println("----------------4. get(index,element)[지정된 index에 객체의 참조변수 반환]------------------");

		// Account getAccount = accountList.get(accountList.size()-1);
		// Type mismatch: cannot convert from Object to Account: Object를 Account로 변환할 수
		// 없다는 의미입니다.
		Account getAccount = (Account) accountList.get(accountList.size() - 1);
		/*
		 * ArrayList는 내부적으로 요소들을 Object 타입의 배열로 관리합니다. 그래서 ArrayList에서 요소를 가져올 때는 기본적으로
		 * Object 타입으로 반환됩니다. 따라서 ArrayList타입인 accountList의 요소의 참조변수는 Object타입이고
		 * 형변환해야한다.
		 */
		System.out.println(getAccount); // 배열의 마지막 요소는 3.에서 set()으로 추가한 9999~임

		/*
		 * 코드에서 System.out.println(accountList);를 실행하면 ArrayList의 내용이 출력됩니다. 이는
		 * ArrayList의 toString 메소드가 호출되기 때문입니다
		 */
		// 참고로 accountList는 ArrayList타입이고 ArrayList는 Collection 인터페이스를 구현한다.

		System.out.println("----------------5. remove(index)[지정된 index에 객체 삭제]------------------");
		// 삭제하면 삭제한 인덱스를 그 뒤에 인덱스가 채워줘야함

		Account removeAccount = (Account) accountList.remove(accountList.size() - 1);// 한마디로 형변환해서 정의하라고~~~
		System.out.println(removeAccount);
		System.out.println("#size: " + accountList.size());
		System.out.println(accountList);

		System.out.println(
				"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("********************1.계좌 전체출력*******************");
		
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			tempAccount.print();// print()는 Account클래스에만 있으니까
		}
		
		/*
		 Account.headerPrint();
		for (Object account : accountList) {
			Account acc = (Account) account;
			acc.print();
		}
		*/

		System.out.println("**************2.계좌번호3333번 한개찾기*****************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo() == 3333) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("**************3.계좌주이름 KING인계좌 여러개찾기********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
		}
		System.out.println();
		System.out.println("**************4.계좌번호 4444번 계좌한개삭제************");

		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo() == 4444) {
				System.out.println(">>삭제전 size: " + accountList.size());
				Account removeAcc = (Account)accountList.remove(i);
				removeAcc.print();
				System.out.println(">>삭제 후 size: " + accountList.size());
				break;
			}
		}
		System.out.println();
		
	
		
		
		System.out.println("**************5.계좌주이름 KING인계좌 여러개삭제[QUIZ]**");
	
	
		for(int i=0;i<accountList.size();i++) {
			if(((Account)accountList.get(i)).getOwner().equals("KING")) {
				Account rAccount = (Account)accountList.remove(i);
				rAccount.print();
				i--;
			}
		}
		
/*
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(i-1>=0) {										//  i가 1부터는 이전의 수가 있기 때문에이렇게 설정
																//이전에 삭제가 이루어졌다면 앞으로 옮겨진 요소도 삭제 조건에 충족하는 경우가 있어서
				tempAccount = (Account) accountList.get(i-1);
				if(tempAccount.getOwner().equals("KING")) {// 옮겨진 이전의 수가 삭제 조건에 충족하면
					 Account reAccount =(Account)accountList.remove(i-1);	
					reAccount.print();
				}											//이전수가 조건에 충족하는 요소가 아니면 뭐 없다 그냥 넘어가					
				
				tempAccount = (Account) accountList.get(i);	//여기서부터는 원래의 수(i)임
				if(tempAccount.getOwner().equals("KING")) { //원래수(i)가 
					 Account reAccount =(Account)accountList.remove(i);	
					reAccount.print();
				}
				
			} else{ // 맨 처음에 i =0이라서                   0보다 앞에 수는 없는경우가 있으니까 
				tempAccount = (Account) accountList.get(i);
				if (tempAccount.getOwner().equals("KING")) {
					 Account reAccount =(Account)accountList.remove(i);	
					reAccount.print();;
				} 
		
			}//if문 끝
			
		}//for문끝
*/
		
		
		
		
		System.out.println("********************1.계좌 전체출력*******************");
		
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			tempAccount.print();// print()는 Account클래스에만 있으니까
		}
	
		
	}

}