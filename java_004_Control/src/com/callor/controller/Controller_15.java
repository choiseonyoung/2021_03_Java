package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 = 0;
		int i = 0;
		int sum = 0;

		System.out.println("==========================");

		s1 = rnd.nextInt(100) + 1;
		s2 = rnd.nextInt(100) + 1;
		s3 = rnd.nextInt(100) + 1;
		s4 = rnd.nextInt(100) + 1;
		s5 = rnd.nextInt(100) + 1;
		s6 = rnd.nextInt(100) + 1;
		s7 = rnd.nextInt(100) + 1;
		s8 = rnd.nextInt(100) + 1;
		s9 = rnd.nextInt(100) + 1;
		s10 = rnd.nextInt(100) + 1;

		System.out.println("학생" + (++i) + ": " + s1);
		System.out.println("학생" + (++i) + ": " + s2);
		System.out.println("학생" + (++i) + ": " + s3);
		System.out.println("학생" + (++i) + ": " + s4);
		System.out.println("학생" + (++i) + ": " + s5);
		System.out.println("학생" + (++i) + ": " + s6);
		System.out.println("학생" + (++i) + ": " + s7);
		System.out.println("학생" + (++i) + ": " + s8);
		System.out.println("학생" + (++i) + ": " + s9);
		System.out.println("학생" + (++i) + ": " + s10);

		sum = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10;

		float avg = (float) sum / 10;

		System.out.println("--------------------------");
		System.out.printf("총점: %d, 평균: %3.2f\n", sum, avg);
		System.out.println("==========================");

	}

}
