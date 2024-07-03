package com.bochung1;

//제너릭 메소드 사용 예제 
public class Util {
	public static <T> BoxGeneric<T> boxing(T t) {
		BoxGeneric<T> boxGeneric = new BoxGeneric<T>();
		boxGeneric.set(t);
		
		return boxGeneric;
	}
}
