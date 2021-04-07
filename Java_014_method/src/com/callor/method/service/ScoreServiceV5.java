package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	String[] subject;
	InputServiceV2 inService;
	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;
	Integer[] stu;
	Integer[] sum;
	float[] avg;

	public ScoreServiceV5() {
		subject = new String[] { "국어", "영어", "수학" };
		inService = new InputServiceV2();
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
		stu = new Integer[5];
		sum = new Integer[stu.length];
		avg = new float[stu.length];
	}

	public void inputScore() {

		Integer score;
		Integer[][] subScore = new Integer[5][3];

		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < subject.length; j++) {
				System.out.println((i + 1) + "번째 학생 점수 입력");
				subScore[i][j] = inService.inputValue(subject[j], 0, 100);
				if (subScore[i][j] == null) {
					System.out.println("종료");
					return;
				}
			}
			sumScore(i, kors.get(i), engs.get(i), maths.get(i));
			avgScore(i, sum[i]);
		}
		
		for (int i = 0 ; i < stu.length; i++) {
			kors.add(subScore[0][i]);
		}
	}

	public void sumScore(int i, int kor, int eng, int math) {
		sum[i] = kor + eng + math;
		avgScore(i, sum[i]);
	}

	public void avgScore(int i, int sum) {
		avg[i] = sum / subject.length;
	}

	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("\t\t성적 리스트");
		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < stu.length; i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%3.2f\n", i + 1, kors.get(i), engs.get(i), maths.get(i), sum[i],
					avg[i]);
		}
	}

}
