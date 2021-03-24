package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] num = new int[20];

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100) + 1;
		}

		// 요소 : 배열의 몇번째 값
		// 위치 : 배열의 몇번째
		// 첨자 : 배열의 몇번째 인가를 알려주는 값
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				// System.out.printf("%d번 ", i);
				System.out.printf("%d 번째 값 : %d\n", i, num[i]);
			}
		}
	}

}
