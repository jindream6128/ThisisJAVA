package chap07.ch07.sec03.exam02;

public class Parent {
	
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Paretn() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}

}
