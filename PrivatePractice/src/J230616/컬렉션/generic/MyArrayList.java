package generic;

public class MyArrayList< E > {//  보통 한글자 대문자를 쓴다.타입을 인자로 받는것.
	/*
	 * <>는 제네릭(Generic) 타입을 나타냅니다. 
	 * 제네릭은 Java에서 컬렉션과 같은 데이터 구조 클래스를 작성할 때 사용되는 기능으로, 
	 * 컴파일 시간에 타입 안정성을 보장하기 위해 사용됩니다.
	 * 
	 * 제네릭을 사용하여 다양한 타입의 요소를 저장할 수 있습니다. 
	 * 제네릭을 사용하면 컬렉션 객체가 저장하는 요소의 타입을 명시할 수 있고, 
	 * 해당 타입 이외의 요소가 추가되는 것을 컴파일러가 막아줍니다.
	 */
	private Object[] elementData;
	private int size;
	public MyArrayList() {
		elementData=new Object[0];
		size=elementData.length;
	}
	public int size() {
		return size;
	}
	public void add(E element) { //  main에서 typeArg에 타입을 선언하면 그 타입만 써야된다고
		Object[] tempElementData=
				new Object[elementData.length+1];
		for(int i=0;i<elementData.length;i++) {
			tempElementData[i]=elementData[i];
		}
		tempElementData[tempElementData.length-1] =element; 
		this.elementData=tempElementData;
		this.size=this.elementData.length;
	}
	public E get(int index) {
		return (E)this.elementData[index];
	}
	
	
}