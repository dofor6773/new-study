package sec03.exam03;

public class Car02 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car02() {
	}
	
	Car02(String mode1) {
		this.model = model;
	}
    
	Car02(String mode1, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car02(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
