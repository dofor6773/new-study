package sec03.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		/*char charValue1 = 'A';
		int intValue = charValue1;   //65가 저장됨
		
		byte byteValue = 65;
		char charValue2 = byteValue; //컴파일 에러
		*/
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}
}
