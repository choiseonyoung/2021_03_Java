package com.callor.method.service;

import com.callor.method.InputService;

public class NumberServiceV7 {

	String[] sub;
	Integer[] subScore;
	InputService is;

	public NumberServiceV7() {
		// TODO Auto-generated constructor stub
		sub = new String[] { "국어", "영어", "수학", "과학", "국사" };
		subScore = new Integer[5];
		is = new InputService();
	}

	public void inputScore() {
		for (int i = 0; i < sub.length; i++) {
			subScore[i] = checkScore(sub[i]);
		}
	}

	public Integer checkScore(String sub) {
		int num;
		while (true) {
			num = is.inputValue(sub);
			if (num >= 0 && num <= 100) {
				return num;
			} else {
				System.out.println("점수는 0 ~ 100");
				continue;
			}
		}
	}
}
