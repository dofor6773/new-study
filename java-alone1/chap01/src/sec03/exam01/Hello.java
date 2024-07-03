package sec03.exam01;
/*클래스 선언부*/public class Hello /*클래스 이름*/{//클래스 이름
	//프로그램 실행 진입점(라인 주석)
	/*메소드 선언부*/public static void main/*메소드 이름*/(String[] args) {//메소드 이름
		//콘솔에 출력하는 실행문(라인 주석)
		System.out.println("Hello, Java");
		
		/* 
        범위 주석              //범위 주석
        직상지: 신용권
        작성일: 2025.12.31
       */
		
		/*
		int x = 1;, int y = 2;
		int result =
		x + y;
		*/
		
		int x;                            // 변수 x선언
        x = 1;                            // 변수 x에 1을 저장
        int y = 2;                        // 변수 y을 선언하고 2를 저장
        int result = x + y; // 1 + 2 = 3  // 변수 result를 선언하고 변수 x와 y를 더한 값을 저장
        System.out.println(result);       // println 메소드 호출
    }   //end of main(라인 주석)
}    //end of class(라인 주석)

/* 메모
1. 파일을 수정 했다면 파일 꼭 저장
2. Hello, String, System 등 앞에 대문자로 작성해야 하며, 끝에 ;(세미콜론)을 붙여줘야 함
3. 바이트 코드 파일 실행 방법: 파일 우클릭 -> Run As -> Java Application
4. 문자열 내부에는 주석을 붙일 수 없다
ex) System.out.println("Hello, /*주석이 될수 없음*///welcome to the java world!");
/*5. 패키지 표시 변경 방법: 점3개 클릭 -> Package Presentation -> Hierarchical*/

