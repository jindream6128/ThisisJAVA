package chap06.sec07.exam05;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model){
		this(model, "은색", 250);
		System.out.println("1"); //이걸 위에 넣으면 오류가 뜬다
	}
	
	Car(String model, String color){
		this(model,color,250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color =color;
		this.maxSpeed=maxSpeed;
	}
}
