package com.callor.app.service;

import com.csy.standard.InputService;
import com.csy.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {

	public void inputScore() {
		
		Integer kor;
		Integer eng;
		Integer math;
		Integer sum;
		Float avg;
		
		InputService isV1 = new InputServiceImplV1();
		
		kor = isV1.inputValue("국어", 0, 100);
		eng =isV1.inputValue("영어", 0, 100);
		math = isV1.inputValue("수학", 0, 100);
		
		sum = kor + eng + math;
		avg = (float)sum / 3;
		
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %3.2f", avg);
	}
	
	
}
