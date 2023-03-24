package chap12.sec03.exam02;

public class Student {

	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {return no;}
	public String getName() {return name;}
	
	@Override
	public int hashCode() {
		//원래 hashCode는 정수형
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student target) {//Student의 객체인지 확인하고 맞으면 target르 형변환
//			if(no == target.no && name.equals(target.getName())) {
//				//번호와 이름이 둘다 같으면 true
//				return true;
//			}
//		}
//		return false;
//	}
	
}
