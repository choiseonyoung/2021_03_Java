package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> primeList;
	private int[] num;

	public PrimeServiceV4() {
		rnd = new Random();
		primeList = new ArrayList<Integer>();
		num = new int[50];
	}

	public void primeNum() {
		System.out.println("< 생성된 난수 >");
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(51) + 50;
			System.out.printf("%d ", num[i]);
		}

		int j = 0;

		for (int i = 0; i < num.length; i++) {
			for (j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					break;
				}
			}
			if (j >= num[i]) {
				primeList.add(num[i]);
			}
		}
	}

	public void printPrime() {
		/*
		 * System.out.println(); System.out.println(); System.out.println("< 소수 리스트 >");
		 * for(int i = 0; i < primeList.size() ; i++) {
		 * System.out.println(primeList.get(i)); }
		 */
		for (Integer prime : primeList) {
			// 배열, List 구조의 데이터들을 전체를 반복하여 처리할 경우
			System.out.println(prime);
		}
	}
}
