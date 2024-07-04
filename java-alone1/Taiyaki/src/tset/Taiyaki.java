package tset;

public class Taiyaki {
    // 필드
    private String flavor;
    private String size;

    // 생성자
    public Taiyaki(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    // 메소드
    public Taiyaki() {
        this.flavor = "Red bean";
        this.size = "Medium";
    }

    // Getter와 Setter 메소드
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // 메소드 오버로딩: 다양한 종류의 붕어빵 정보를 출력하는 메소드
    public void displayInfo() {
        System.out.println("Taiyaki with " + flavor + " flavor, size: " + size);
    }

    public void displayInfo(String message) {
        System.out.println(message + " Taiyaki with " + flavor + " flavor, size: " + size);
    }
}
