package com.bochung1;

public class BoxingMethodExample {
	public static void main(String[] args) {
		// Util.<Integer>boxing의 <Integer>는 생략이 가능
		BoxGeneric<Integer> box1 = Util.<Integer>boxing(100);
		box1.get();
		
		BoxGeneric<String> box2 = Util.boxing("100");
		box2.get();
	}
}
