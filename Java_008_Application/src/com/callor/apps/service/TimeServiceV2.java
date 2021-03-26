package com.callor.apps.service;

public class TimeServiceV2 {

	int[] intNums;

	public TimeServiceV2() {
		intNums = new int[8];
	}

	public void Nums() {
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 2;
		}
	}

	public void printTimes() {
		for (int i = 0; i < intNums.length; i++) {

			System.out.println( LinesService.dLines(50) );
			System.out.printf("%d 단 구구단\n", intNums[i]);
			System.out.println( LinesService.sLines(50) );

			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", intNums[i], j, intNums[i] * j);
			}
		}
	}
}
