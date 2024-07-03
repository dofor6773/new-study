package sec01.exam05;

import sec01.exam03.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv1 = new SmartTelevision();
		
		RemoteControl rc = tv1;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOn();
		
		Searchable sa = tv1;
		sa.search("www.naver.com");
	}

}
