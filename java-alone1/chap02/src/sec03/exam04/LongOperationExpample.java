package sec03.exam04;

public class LongOperationExpample {

	public static void main(String[] args) {
		//정수 연산에서의 자동타입 변환(long 예제)
		byte value = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value + value2 + value3;
		System.out.println(result);
	}
}
