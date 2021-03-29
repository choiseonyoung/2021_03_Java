package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class Score_01 {

	public static void main(String[] args) {
		
		// ScoreServiceV1 클래스를 사용하여 객체를 생성할 때,
		// 정수 5를 전달해 주고 5만큼의 배열을 생성하도록 코드를 변경
		ScoreServiceV1 ssV1 = new ScoreServiceV1(5);
		
		/*
		 * method를 호출하여 명령 실행하기
		 * 	ssV1.makeScores() 명령을 한 줄 실행하므로써
		 * 	ScoreServiceV1A 클래스에 정의되어 있는 "어떤 코드"가 실행되는 효과를 만들어낸다.
		 */
		ssV1.makeScores();
		
		ssV1.addNum();

		ssV1.sum();
		ssV1.avg();
		ssV1.list();
		
		ssV1.addNum();
		
		/*
		 * inputScore() method는 private 으로 선언되어 있기 때문에
		 * 객체.inputScore() 형식으로 사용할 수 없다.
		 */
		// ssV1.inputScore();

	}

}
