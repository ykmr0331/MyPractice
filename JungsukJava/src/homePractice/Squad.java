public class Squad {

	/*
	 * 1.속성[멤버필드(변수)]
	 */

//이름, 키, 주발, 성향, 몸값, 이적료

	String name;
	int height;
	String doFoot;
	String personality;
	int bodyCost;
	int transferCost;

	/*
	 * 2.행위[멤버메쏘드]ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	 */

	/*
	 * 2-0. 선수 데이터 입력
	 */
	void enterData(String name, int height, String doFoot, String personality, int bodyCost, int transferCost) {
		this.name = name;
		this.height = height;
		this.doFoot = doFoot;
		this.personality = personality;
		this.bodyCost = bodyCost;
		this.transferCost = transferCost;
	}

	/*
	 * 2-1 선수영입 혜자인이 아닌지 몸값 - 이적료 >= 양수이면 o 아니면 x
	 */
	boolean goodTransfer(int bodyCost, int transferCost) {
		this.bodyCost = bodyCost;
		this.transferCost = transferCost;
		int result = this.bodyCost - this.transferCost;
		boolean result2 = true;

		if (result >= 0) {
			result2 = true;
		} else {
			result2 = false;
		}

		return result2;
	}

	/*
	 * 2-2 포메이션 위치 성향 :aggressive, medium, defensive( fw, mf, cb) 주발 : right left,
	 * (right left)
	 */
	String position(String doFoot, String personality) {
		this.doFoot = doFoot;
		this.personality = personality;
		String position1 = "";
		String position2 = "";

		if (doFoot == "right") {
			position1 = "right";

			if (personality == "aggressive") {
				position2 = "FW";
			} else if (personality == "medium") {
				position2 = "MF";
			} else if (personality == "defensive") {
				position2 = "CB";
			} else {
				position2 = "성향을 잘못 입력했습니다.\n (aggressive, medium, defensive 중 하나를 입력하세요)";
			}
		} else if (doFoot == "left") {
			position1 = "left";

			if (personality == "aggressive") {
				position2 = "FW";
			} else if (personality == "medium") {
				position2 = "MF";
			} else if (personality == "defensive") {
				position2 = "CB";
			} else {
				position2 = "성향을 잘못 입력했습니다.\n (aggressive, medium, defensive 중 하나를 입력하세요)";
			}
		}

		String yourPosition = position1 + position2;
		return yourPosition;
	}

	/*
	 * 스쿼드헤더출력
	 */
	void headerPrint() {
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s\n",  "이름", "키", "주발", "성향", "몸값", "이적료","영입혜자?","포메이션");
		System.out.println("----------------------------------------------------------------------------");
	
	}

	/*
	 * 스쿼드 정보 출력
	 */
	void print() {
		
		System.out.printf("%s %d %s %s %d %d %b, %s",
				this.name,this.height,this.doFoot,this.personality, this.bodyCost, this.transferCost, goodTransfer(this.bodyCost,this.transferCost), position(this.doFoot, this.personality));
		//this뒤에 .붙이는거 까먹지 말고 이미 클래스에서 선언한 메소드는 문자열함수 입력할 때는 this안붙여도 된다.

		
	}

		

		
	
}
