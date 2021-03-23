package com.callor.apps;

/*
 * 5명 학생의 3과목 점수(국어, 영어, 수학)의 성적표 만들기
 */

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		int[] sum = new int[5];
		float[] avg = new float[5];
		
		int totalKor = 0;
		int totalEng = 0;
		int totalMath = 0;

		// 가상의 점수 생성
		for (int i = 0; i < 5; i++) {
			int scoreKor = rnd.nextInt(51) + 50;
			int scoreEng = rnd.nextInt(51) + 50;
			int scoreMath = rnd.nextInt(51) + 50;
			
			intKor[i] = scoreKor;
			intEng[i] = scoreEng;
			intMath[i] = scoreMath;
			
			totalKor += scoreKor;
			totalEng += scoreEng;
			totalMath += scoreMath;
			
		}

		for (int i = 0; i < 5; i++) {
			sum[i] = intKor[i] + intEng[i] + intMath[i];
			avg[i] = (float) sum[i] / 3;
		}

		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%3.2f\n", i + 1, intKor[i], intEng[i], intMath[i], sum[i], avg[i]);
		}
		System.out.println("==============================================");

		System.out.printf("총점\t%d\t%d\t%d\t%d", totalKor, totalEng, totalMath, totalKor+totalEng+totalMath );
	}

}
