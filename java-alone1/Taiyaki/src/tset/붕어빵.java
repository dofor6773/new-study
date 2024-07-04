package tset;

public class 붕어빵 {
	// 필드
    String 속재료;
    int 개수;

    // 생성자
    붕어빵(String 속재료, int 개수) {
        this.속재료 = 속재료;
        this.개수 = 개수;
    }

    // 메소드
    void 굽기() {
        System.out.println(개수 + "개의 " + 속재료 + " 붕어빵을 굽고 있습니다.");
    }

    void 판매하기() {
        System.out.println(개수 + "개의 " + 속재료 + " 붕어빵을 판매합니다.");
    }

    void 정보보기() {
        System.out.println("붕어빵 정보 - 속재료: " + 속재료 + ", 개수: " + 개수);
    }
}
