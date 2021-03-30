package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

/* ScoreServiceV1을 extends(상속, 확장)
* 	ScoreServiceV1에 있는 method를 그대로 이어받아서
* 	ScoreServiceV2에 마치 복사 붙이기 한 것처럼 사용하겠다
* 
* V1에서 작성된 inputScore() 를 V2에서는 새롭게 개선(기능 업그레이드)
*/

public class ScoreServiceV2 extends ScoreServiceV1 {

	Scanner scan;
	List<ScoreVO> scoreList;

	public ScoreServiceV2() {

		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();

	}

	public Integer inputScore(String strNum, String strSub) {
		int intScore = 9;
		while (true) {
			System.out.println(strNum + " 번의 " + strSub + "점수를 입력하세요( 중단 : -1 )");
			System.out.print(">> ");
			intScore = scan.nextInt();
			if (intScore == -1) {
				return null;
			} else if (intScore < 0 || intScore > 100) {
				System.out.println(strSub + "점수는 0 ~ 100까지!!");
				continue;
			}
			break;
		}
		return intScore;
	}

	public Integer inputScore() {

		String[] strSubject = { "국어", "영어", "수학" };
		Integer[] intScores = new Integer[strSubject.length];

		/*
		 * scoreList의 데이터 개수를 계산하여 입력할 학번을 자동으로 생성하기
		 */
		int nSize = scoreList.size();
		String strNum = String.format("%03d", nSize + 1);

		for (int i = 0; i < strSubject.length; i++) {
			intScores[i] = this.inputScore(strNum, strSubject[i]);
			if (intScores[i] == null) {
				return null;
			}
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intScores[0];
		scoreVO.eng = intScores[1];
		scoreVO.math = intScores[2];
		scoreList.add(scoreVO);

		return 0;

	} // inputScore()

	public void printScore() {

		this.printHeader();

		for (int i = 0; i < scoreList.size(); i++) {
			// scoreList의 i 번째 저장된 값을 읽어서 ScoreVO 형 sVO 객체에 담기
			ScoreVO sVO = scoreList.get(i);

			System.out.print(sVO.num + "\t");
			System.out.print(sVO.kor + "\t");
			System.out.print(sVO.eng + "\t");
			System.out.print(sVO.math + "\n");
		}

	} // printScore()

	private void printHeader() {

		System.out.println("* 빝나라 고교 성적처리 V1");
		System.out.println(Lines.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println(Lines.sLine(50));

	}

}
