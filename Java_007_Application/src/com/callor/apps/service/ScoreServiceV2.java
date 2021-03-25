package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV2 extends ScoreServiceV1 {

	
	// for(int i = 0)
	// int members = 5
	// method의 괄호() 안에 선언된 변수
	// 매개변수, parameter 라고 한다.
	
	public ScoreServiceV2( int members ) {
		
		intKor = new int[members];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
		intSum = new int[intKor.length];
		floatAvg = new float[intKor.length];
	}

	public void score() {
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			intKor[i] = rnd.nextInt(101);
			intEng[i] = rnd.nextInt(101);
			intMath[i] = rnd.nextInt(101);
		}
	}

	public void scoreSum() {
		intSum = new int[10];
		for (int i = 0; i < 10; i++) {
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
		}
	}

	public void scoreAvg() {
		floatAvg = new float[10];
		for (int i = 0; i < 10; i++) {
			floatAvg[i] = ((float) intSum[i] / 3);
		}
	}

	public void scoreList() {
		System.out.println("===============================================");
		System.out.println("\t\t 성적리스트");
		System.out.println("-----------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < 10; i++) {
			System.out.printf((i + 1) + "\t%3d\t%3d\t%3d\t%3d\t%3.2f\t", intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
			System.out.println();
		}
		System.out.println("===============================================");
	}

}
