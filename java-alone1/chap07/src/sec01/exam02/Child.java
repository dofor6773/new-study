package sec01.exam02;

public class Child extends Parent {
	void method3() {
		System.out.println("Child의 method3");
	}
	
	@Override
	void method2() {
		System.out.println("Child의 method2");
		super.method2(); //부모클래스의 method2메소드 호출
	}
}
