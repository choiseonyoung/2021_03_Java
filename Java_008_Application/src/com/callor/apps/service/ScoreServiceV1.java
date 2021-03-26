package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] sum;
	float[] avg;
	Scanner scan;
	
	public ScoreServiceV1() {
		intKor = new int[5];
		intEng = new int[5];
		intMath = new int[5];
		sum = new int[5];
		avg = new float[5];
	}
	
	public void score() {
		scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		for ( int i = 0 ; i < intKor.length ; i++ ) {
			System.out.printf("%d번 학생\n", i+1);
			System.out.print("국어 >> ");
			intKor[i] = scan.nextInt();
			System.out.print("영어 >> ");
			intEng[i] = scan.nextInt();
			System.out.print("수학 >> ");
			intMath[i] = scan.nextInt();
		}
	}
	
	public void sum() {
		for(int i = 0 ; i < intKor.length ; i++ ) {
			sum[i] = intKor[i] + intEng[i] + intMath[i];
		}
	}
	
	public void avg() {
		for(int i = 0 ; i < intKor.length ; i++ ) {
			avg[i] = ( (float)sum[i] / 3 );
		}
	}
	
	public void list() {
		System.out.println(LinesService.dLines(50));
		System.out.println("\t\t 성적 리스트");
		System.out.println(LinesService.sLines(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for( int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", i+1, intKor[i], intEng[i], intMath[i], sum[i], avg[i]);
		}
		System.out.println(LinesService.dLines(50));
	}
	
}
