package tset;

public class 붕어빵 {
	// 필드 (객체의 특성)
    String 맛;
    int 개수;

    // 생성자 (객체를 생성할 때 필드 초기화)
    붕어빵(String 맛, int 개수) {
        this.맛 = 맛;
        this.개수 = 개수;
    }

    // 메소드 (객체의 기능)(void가 있을 때)
    void 굽기() {
        System.out.println(개수 + "개의 " + 맛 + " 붕어빵을 굽고 있습니다.");
    }

    void 판매() {
        System.out.println(개수 + "개의 " + 맛 + " 붕어빵을 판매합니다.");
    }

    void 정보() {
        System.out.println("붕어빵 정보 - 맛: " + 맛 + ", 개수: " + 개수);
    }
}

