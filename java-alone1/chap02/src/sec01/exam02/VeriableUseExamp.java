package sec01.exam02;

public class VeriableUseExamp {

	public static void main(String[] args) {
		int hour = 3;
		int miniut = 5;
		System.out.println(hour + "시간" + miniut + "분");
		
		int totalminute = (hour*60) + miniut;
		System.out.println("총" + totalminute + "분");
	}
}
