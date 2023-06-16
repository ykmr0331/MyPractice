package wrapper;

public class WrappeClass유용한메쏘드Main {

	public static void main(String[] args) {
		System.out.println("int ---->String");
		int y=2147483647;
		String yStr1=Integer.toString(y);
		System.out.println(yStr1);
		String yStr2=y+"";
		System.out.println(yStr2);
		String yStr3=Integer.toBinaryString(y);
		System.out.println(yStr3);
		String yStr4=Integer.toHexString(y);
		System.out.println(yStr4);
		System.out.println(">>>>>>>>>> String --> int ,double,boolean <<<<<<<<<<<<<<");
		System.out.println(Integer.parseInt("2147483647"));
		System.out.println(Double.parseDouble("3.141592"));
		System.out.println(Boolean.parseBoolean("false"));
		
		char c='2';
		System.out.println(Character.isUpperCase(c));
		System.out.println(Character.isLowerCase(c));
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isLetter(c));
		
		String str="Hello Java !!! $%&*$*$%* _++ 23626351263김경호 제임스딘";
		for(int i=0;i<str.length();i++) {
			char tempChar = str.charAt(i);
			//System.out.println(tempChar);
			int characterType = Character.getType(tempChar);
			//System.out.println(characterType);
			if(characterType==Character.UPPERCASE_LETTER) {
				System.out.println("UPPERCASE_LETTER:"+tempChar);
			}
			if(characterType==Character.LOWERCASE_LETTER) {
				System.out.println("LOWERCASE_LETTER:"+tempChar);
				
			}
			if(characterType==Character.DECIMAL_DIGIT_NUMBER) {
				System.out.println("DECIMAL_DIGIT_NUMBER:"+tempChar);
			}
		}
		
		
		
		
	}

}