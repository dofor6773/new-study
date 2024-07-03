public class Main {

	public static void main(String[] args) {
		// 기본 Taiyaki 객체 생성
        Taiyaki taiyaki1 = new Taiyaki();
        taiyaki1.displayInfo();
        taiyaki1.displayInfo("Delicious");

        // 크기와 맛을 지정한 Taiyaki 객체 생성
        Taiyaki taiyaki2 = new Taiyaki("Custard", "Large");
        taiyaki2.displayInfo();

        // ChocolateTaiyaki 객체 생성
        ChocolateTaiyaki chocoTaiyaki1 = new ChocolateTaiyaki();
        chocoTaiyaki1.displayInfo();

        // Sprinkles 추가된 ChocolateTaiyaki 객체 생성
        ChocolateTaiyaki chocoTaiyaki2 = new ChocolateTaiyaki("Large", true);
        chocoTaiyaki2.displayInfo();
    }
}
