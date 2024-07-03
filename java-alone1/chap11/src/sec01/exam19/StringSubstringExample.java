package sec01.exam19;

public class StringSubstringExample {

	public static void main(String[] args) {
		//문자열 잘라내기로 substring메소드 사용
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);     // 왼쪽은 시작 언덱스 번호, 오른쪽은 가져올 만큼 문자열의 인덱스 번호
		System.out.println(firstNum); // 880815
		
		String secondNum = ssn.substring(7);       // 시작 인덱스 번호부터 끝 인덱스 번호까지의 문자열 가져오기
		System.out.println(secondNum); // 1234567
	}
}
