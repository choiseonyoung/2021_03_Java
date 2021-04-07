package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * 데이터를 입력(키보드, Random, 파일, 인터넷)
 * 		데이터를 VO에 담고
 * 입력된 데이터를 List에 추가
 * 
 * 		연산을 수행
 * 
 * 다시 List 저장
 * 데이터를 읽어
 * 		List에서 추출하여 VO에 담고
 * 출력
 */
public class ScoreServiceV6 {
	
	protected List<ScoreVO> scoreList;
	protected InputServiceV2 inService;
	protected ScoreVO scoreVO;

	public ScoreServiceV6() {
		inService = new InputServiceV2();
		scoreList = new ArrayList<ScoreVO>();
	}

	public void inputScore() {
		for (int i = 0; i < 5; i++) {
			scoreVO = new ScoreVO();

			scoreVO.setKor(inService.inputValue("국어", 0, 100));
			scoreVO.setEng(inService.inputValue("영어", 0, 100));
			scoreVO.setMath(inService.inputValue("수학", 0, 100));
			// if scores[i] == null
			// return

			scoreList.add(scoreVO);
		}
	}
	
	public void printScore() {
		
		/*
		int nSize = scoreList.size();
		
		System.out.println("=".repeat(50));
		for (int i = 0 ; i < subject.length; i++) {
			System.out.println(subject[i] + "\t");
		}
		System.out.println();
		System.out.println("-".repeat(50));
		*/
		
		for(int i = 0 ; i < nSize; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.println(scoreVO.getKor() + "\t");
			System.out.println(scoreVO.getEng() + "\t");
			System.out.println(scoreVO.getMath() + "\n");
		}
		
	}

}