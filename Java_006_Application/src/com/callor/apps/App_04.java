package com.callor.apps;

/*
 * 배열에 저장된 값중에서 짝수가 저장된 최초의 위치는 어디인가
 */

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] num = new int[20];

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < num.length; i++) {
			if ( num[i] % 2 == 0 ) {
				System.out.printf("%d번 값 : %d", i, num[i]);
				break;
			}
		}

	}

}
