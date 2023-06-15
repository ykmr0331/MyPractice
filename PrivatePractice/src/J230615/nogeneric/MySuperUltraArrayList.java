package nogeneric;

public class MySuperUltraArrayList {
	private Object[] elementData;

	
	public MySuperUltraArrayList() {
		elementData=new Object[0];
	}
	
	
	public int size() {
		return elementData.length;
	}
	public void add(Object element) {
		Object[] tempElementData=
				new Object[elementData.length+1];
		for(int i=0;i<elementData.length;i++) {
			tempElementData[i]=elementData[i];
		}
		tempElementData[tempElementData.length-1] =element; 
		elementData=tempElementData;
	}
	public Object get(int index) {
		return elementData[index];
	}
	
	
}