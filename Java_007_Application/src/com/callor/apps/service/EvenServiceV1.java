package com.callor.apps.service;

import java.util.Random;

/* public class EvenServiceV1 {

	int[] intNum;
	int[] even;
	int e = 0;

	public EvenServiceV1() {
		intNum = new int[100];
		even = new int[100];
	}

	public void makeNum() {
		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
	}

	public void evenList() {
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				even[e] = intNum[i];
				System.out.printf("%d ", even[e]);
				e++;
			}
		}
		System.out.println();
	}

	public void evenSum() {
		int sum = 0;
		System.out.printf("짝수들의 합 : ");
		for (int i = 0; i < e; i++) {
			sum += even[i]; 
		}
		System.out.printf("%d ", sum);
	}
}
*/

// 클래스 선언문 (시작하는 곳)
public class EvenServiceV1 {

	// int[] intNums1 = new int[100]; 이렇게 하지 않고
	int[] intNum; // 여기서는 선언만 하고

	// 생성자 method
	// 클래스를 선언하면 자동으로 만들어지는 method
	// 별도의 코드가 필요없으면 만들지 않아도 된다
	// new EventServiceV1() 코드에서 호출되는 method
	// 생성자 method에는 클래스 영역의 변수들을 초기화 생성하기 위한 코드들이 작성된다.
	public EvenServiceV1() {
		intNum = new int[100]; // 생성은 생성자에서
	}

	public void makeNum() {

		Random rnd = new Random();

		// intNums 배열 개수만큼 코드를 반복실행하라
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}
	}

	/*
	 * 짝수(Even) 홀수(Odd)
	 */
	public void evenList() {
		
		int nCount = 0;
		System.out.println("=============================");
		System.out.println("짝수들의 리스트");
		System.out.println("-----------------------------");
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.println(intNum[i]);
				nCount++;
			}
		}
		System.out.println("짝수들의 개수 : " + nCount);
		System.out.println("=============================");
	}

	public void evenSum() {
		System.out.println();
		int sum = 0;
		System.out.printf("짝수들의 합 : ");
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				sum += intNum[i];
			}
		}
		System.out.printf("%d ", sum);
	}
}
