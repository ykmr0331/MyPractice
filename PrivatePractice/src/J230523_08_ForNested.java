
public class J230523_08_ForNested {

	public static void main(String[] args) {

		/*
		
		 */
		for(int i = 0; i < 5; i++) {
		System.out.print("★★★★★");
		System.out.print("\n");
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) { //이건 ★★★★★ 나타내려고
				System.out.printf("%s[%d,%d]","★",i,j);
			}
			System.out.print("\n");
			}
	
	
	
	}//main메서드 종료

}
