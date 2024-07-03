package sec03.exam04;

public class Car03 {
	//필드
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		
		//생성자
		Car03() {
		}
		
		Car03(String model) {
			this(model, null, 0);  // 밑에 있는 3개의 매개변수가 있는 생성자 호출
		}
		
		Car03(String model, String color) {
			this(model, color, 0); // 밑에 있는 3개의 매개변수가 있는 생성자 호출
		}
		
		Car03(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
	}

