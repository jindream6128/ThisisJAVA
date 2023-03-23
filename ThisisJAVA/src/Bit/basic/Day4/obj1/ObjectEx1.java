package Bit.basic.Day4.obj1;

//예약어 정해져있는 keyword
//클래스 
//ObjectEx1 클래스 정의
//new를 통해서 생성
//class -> 설계도 -> 묶음 -> 속성과, 기능을 진 묶음.
//생성자 -> 메모리할당 -> 인스턴스 변수 초기화
//객체는 -> 사물 그자체 -> 객체는 클래스를 통해서 만들어진다. 


//abstract와 interface의 차이 제일 중요!!!!!!!!

public class ObjectEx1 {
	private char[] value;
	
	public ObjectEx1(char[] value) {
		this.value = value;
	}
	
	public char charAt(int index) {
		if(index <0 || index>value.length-1) {
			throw new StringIndexOutOfBoundsException();
		}
		return this.value[index];
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(obj instanceof String) {
			char[] tmp = ((String)(obj)).toCharArray();
			if(tmp.length != this.value.length) return false;
			for(int i = 0;i<tmp.length;i++) {
				if(tmp[i]!=value[i]) return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s1 = new String("abc".toCharArray());
		String s2 = new String("def".toCharArray());
		
		System.out.println(s2.equals(s1));
	}
	
	
}
