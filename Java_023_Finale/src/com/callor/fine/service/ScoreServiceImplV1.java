package com.callor.fine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService{

	private List<ScoreVO> scoreList;
	private Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	public void inputScore() {
	}

	public void printList() {
	}
	
	// 인터페이스를 임플리먼트한 코드의 모양
	// 1. implements 키워드
	// 2. 2개의 메소드를 반드시 구현해야 한다
}
