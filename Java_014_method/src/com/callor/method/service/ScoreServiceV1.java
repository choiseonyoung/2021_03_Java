package com.callor.method.service;

public class ScoreServiceV1 {

	public void inputScore() {

		InputServiceV1 isV1 = new InputServiceV1();
		Integer score = isV1.inputValue("국어", 0, 100);

		if (score == null) {
			System.out.println("종료");
		} else {
			System.out.printf("점수 : %d", score);
		}
	}
	
}