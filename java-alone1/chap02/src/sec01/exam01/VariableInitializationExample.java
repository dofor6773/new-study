package sec01.exam01;

/* 
 정수형 변수 <-하나의 값만 저장 가능-정수값 
 실수형 변수 <-하나의 값만 저장 가능-실수값
  
 int(타입) age;(변수 이름) //정수(int)를 저장할 수 있는 age 변수 선언
double(타입) value;(변수 이름) //실스(double)를 저장할 수 있는 value 변수 선언

int x; <-동일-> int x, t, z
int y;  
int z;

int score;   //변수 선언
score = 90;  //값 저장 90 -(저장)-> score 
int score = 90;  // 90 -(저장)-> score
*/

public class VariableInitializationExample {
	public static void main(String[] args) {
		int value = 20;    
		//변수 value 선언하고 초기화
		
		/*잘못된 코딩 예
		int value;   //변수 value 선언
		int result = value + 10; //변수 value 값을 읽고 10을 더해서 변수 result에 저장
		올바른 코딩 예
		int value = 30;  //변수 value가 30으로 초기화됨
		int result = value + 10;  //변수 value 값(30)을 읽고 10을 더해서 변수 result에 저장
		*/
		
		int result = value + 10;		// 10 + 20 = 30
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		
		System.out.println(result);
		//변수 result 값을 읽고 콘솔에 출력
		value = 0;
		result = 1;	
	}

	int test1 = 10;
}

