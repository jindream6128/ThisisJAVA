package chap12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {

		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(1, "홍길동");
		
		//해시코드가 같은지 검사하기 
		if(s1.hashCode() == s2.hashCode()) {
			//안에 있는 데이터도 같은지 검사하기
			if(s1.equals(s2)) {
				System.out.println("동등 객체 입니다");
			}else {
				System.out.println("데이터만 다릅니다");
			}
		}else {
			System.out.println("해시코드가 다릅니다");
		}
		
	}

}
