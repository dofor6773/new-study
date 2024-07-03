package sec02.exam02;

import sec02.exam03.Vehicle;

public class Taxi implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
