package sec07;

public class D extends A {
	public D() {
		super(); // A의 기본생성자를 호출
		this.field = "value";	// A의 field 멤버변수
		this.method();
	}
}