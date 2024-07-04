package tset;

public class ChocolateTaiyaki extends Taiyaki {
    // 추가 필드
    private boolean hasSprinkles;

    // 생성자
    public ChocolateTaiyaki(String size, boolean hasSprinkles) {
        super("Chocolate", size);
        this.hasSprinkles = hasSprinkles;
    }

    // 기본 생성자
    public ChocolateTaiyaki() {
        super("Chocolate", "Medium");
        this.hasSprinkles = false;
    }

    // Getter와 Setter 메서드
    public boolean hasSprinkles() {
        return hasSprinkles;
    }

    public void setSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;
    }

    // 메서드 오버라이딩: 추가 속성을 포함한 붕어빵 정보를 출력하는 메서드
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sprinkles: " + (hasSprinkles ? "Yes" : "No"));
    }
}













