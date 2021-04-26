package com.callor.fine;

public class MainEx_03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		AddInt addInt = new AddInt();
		int sum = addInt.add(num1, num2);
		System.out.println(sum);
		// 출력결과는 30
		
		// 어떤 클래스를 만들고 메서드를 어떻게 만들어야할 것인가
	}
}
