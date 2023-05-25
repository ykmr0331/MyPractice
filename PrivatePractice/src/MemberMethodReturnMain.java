
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr = new MemberMethodReturn();
		
		int returnData1 =mmr.method1();
		System.out.println("main block--> returnData1:" + returnData1);
		
		System.out.println(returnData1);
		
		boolean returnData2 = mmr.method2();
		System.out.println("main block-->returnData2: " +returnData2);
		
		int returnData3 = mmr.add(1234, 5678);
		System.out.println("main block -- > returnData3: " + returnData3);
		
		System.out.println("main block -- > returnData4: "+mmr.add(1,8));
		
		String returnMsg = mmr.hello("이효리");
		System.out.println(returnMsg);
		System.out.println(mmr.hello("고고고"));
	
	
	}
	
}
