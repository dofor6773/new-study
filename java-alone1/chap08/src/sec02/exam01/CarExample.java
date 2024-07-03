package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();// 한국 타이어가 굴러갑니다 X 4
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();// 한국 타이어가 굴러갑니다 X 2, 금호타이어가 굴러갑니다
	}
}
