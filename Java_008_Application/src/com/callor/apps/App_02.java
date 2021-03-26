package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_02 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.score();
		ssV1.sum();
		ssV1.avg();
		ssV1.list();
	}
	
}
