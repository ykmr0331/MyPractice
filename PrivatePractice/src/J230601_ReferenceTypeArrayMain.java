

public class J230601_ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a = 345; // 기본형 멤버타입
		int[] ia;    // 배열타입의 주소가 들어감, 배열 안에 들어가는 멤버는 integer형
		Account acc; //Account의 객체 주소값
		Account[] accArray ;//배열타입객체의 주소값, 배열 안에 들어가는 멤버는 Account객체의 주소값
		*/
		
		J230601_Account[] accountArray = new J230601_Account[5];//배열타입임.  
		//Account[] accountArray = new Account() 이렇게 하면 안되는 이유가 Account배열타입의 주소가 들어가야되는데 Account객체의 주소가 들어가려고해서 오류
		
		accountArray[0] =  new J230601_Account(1, "KIM", 30000, 0.3);
		accountArray[1] =  new J230601_Account(2, "LEE", 45000, 4.2);
		accountArray[2] =  new J230601_Account(3, "MIN", 78000, 3.8);
		accountArray[3] =  new J230601_Account(4, "NIM", 92000, 2.9);
		accountArray[4] =  new J230601_Account(5, "OIM", 81000, 1.7);
		
		System.out.println(accountArray); // Account배열타입의 주소
		System.out.println(accountArray[0]); //Account의 주소  이해가냐
		
		J230601_Account.headerPrint();
		System.out.println("------------------------for loop-----------------------------------");
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print(); // 이제는 배열로 만들어놔서 이렇게 for문 가능함
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
