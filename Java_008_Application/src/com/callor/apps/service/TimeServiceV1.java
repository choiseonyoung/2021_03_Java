package com.callor.apps.service;

public class TimeServiceV1 {

	int[] intNums;

	public TimeServiceV1() {
		intNums = new int[8];
	}

	public void Nums() {
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 2;
		}
	}

	/*
	 * 배열에 담긴 값(2 ~ ??) = 단에 해당값
	 */
	public void printTimes() {


		for (int i = 0; i < intNums.length; i++) {
			
			// method에 return ?? 명령문이 있으면
			// 변수 = method() 형식으로 코드를 작성하고
			// method가 return 해준 결과값을 변수에 저장할 수 있다
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);
			
			System.out.println( dLines );
			System.out.printf("%d 단 구구단\n", intNums[i]);
			System.out.println( sLines );

			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", intNums[i], j, intNums[i] * j);
			}
		}
	}
}
