package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참고가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참고가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 StrVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
		    System.out.println("strVar3과 StrVar4는 참고가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참고가 다름");
	    }
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		if (strVar1 == strVar3) {
		    System.out.println("StrVar1과 StrVar3는 참고가 같음");
		} else {
				System.out.println("StrVar1과 StrVar3는 참고가 다름");
		}
		// 참조 타입의 변수들은 모두 null이란 걸 가진다.
		//String str = null;    //"abc" -> empt
		//System.out.println("총 문자수" + str.length()); // NullPointerException이 나서 에러
		//기본 타입(primitvie type)은 null 가질 수 없다
		//int intValue1 = null;
		
		//System.out.println("나오나?");
	}
}

