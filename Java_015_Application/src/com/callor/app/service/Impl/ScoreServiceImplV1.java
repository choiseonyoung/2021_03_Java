package com.callor.app.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.csy.standard.InputService;
import com.csy.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	InputService inService;
	Scanner scan;
	List<ScoreVO> scoreList;
	ScoreVO scoreVO;

	public ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		String selects;
		Integer select = null;

		while (true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 성적추가 2. 성적리스트 출력 0. 업무 종료");
			System.out.print(">> ");
			selects = scan.nextLine();
			try {
				select = Integer.valueOf(selects);
			} catch (NumberFormatException e) {
				System.out.println("메뉴를 똑바로 입력하세요");
			}
			if (select == 1) {
				inScore();
			} else if (select == 2) {
				printScore();
			} else if (select == 0) {
				System.out.println("<< 업무 종료 >>");
				return;
			} else {
				System.out.println("메뉴를 똑바로 입력하세요");
				continue;
			}
		}
	}

	public void inScore() {
		String stuNum;
		String strName;
		Integer intKor;
		Integer intEng;
		Integer intMath;

		scoreVO = new ScoreVO(); // 학생마다 다른 VO 객체 생성

		stuNum = inputNum(); // i번째 학생 학번 입력
		if (stuNum == null) { // QUIT를 입력했으면 종료
			return;
		}
		scoreVO.setNum(stuNum); // VO 객체에 학번 저장

		strName = inputName();
		if (strName == null) { // QUIT를 입력했으면 종료
			return;
		}
		scoreVO.setName(strName); // VO 객체에 이름 저장

		intKor = inputS("국어", 0, 100); // i번째 학생 국어 점수 입력
		if (intKor == null) { // QUIT를 입력했으면 종료
			return;
		}
		intEng = inputS("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		intMath = inputS("수학", 0, 100);
		if (intMath == null) {
			return;
		}
		scoreVO.setKor(intKor); // VO 객체에 성적 저장
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		scoreList.add(scoreVO); // i번째 학생의 학번, 이름, 성적을 scoreList에 추가
		
		return;
	}

	private String inputNum() { // 인터페이스에 있는 method 외에 추가로 만든 함수는 외부 유출 안 되게 private로 하는 게 좋음
		String strNum;
		System.out.println("학번을 입력하세요 ( 종료 : QUIT )");
		while (true) {
			System.out.print(">> ");
			strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				System.out.println("입력취소");
				strNum = null;
			}
			return strNum;
		}
	}

	@Override
	public String inputName() {

		String name;

		System.out.println("이름을 입력하세요");

		while (true) {
			System.out.print(">> ");
			name = scan.nextLine();
			if (name == "") {
				System.out.println("이름을 입력하세요");
				continue;
			}
			return name;
		}
	}

	@Override
	public void inputScore() {
		while (true) {
			System.out.println("국어 점수를 입력하세요(QUIT:입력중단)");
			System.out.print(">> ");
			String strKor = scan.nextLine();
			if (strKor.equals("QUIT")) {
				System.out.println("입력 취소 !!");
				return;
			}
			Integer intKor = null;
			try {
				intKor = Integer.valueOf(strKor);
			} catch (NumberFormatException e) {
				System.out.println("정수나 QUIT만 입력가능 !!");
				continue;
			}
			scoreVO.setKor(intKor);

		}

	}

	private Integer inputS(String sub, int start, int end) {
		String strScore;
		Integer intScore;
		while (true) {
			System.out.println(sub + " 점수를 입력하세요(QUIT:입력중단)");
			System.out.print(">> ");
			strScore = scan.nextLine();
			if (strScore.equals("QUIT")) {
				System.out.println("입력 취소 !!");
				return null;
			}
			try {
				intScore = Integer.valueOf(strScore);
			} catch (NumberFormatException e) {
				System.out.println("정수나 QUIT만 입력가능 !!");
				continue;
			}
			if (intScore < start || intScore > end) {
				System.out.printf("%d ~ %d 사이 값을 입력하세요\n", start, end);
				continue;
			}
			return intScore;
		}
	}

	@Override
	public void printScore() {

		for (int index = 0; index < scoreList.size(); index++) {
			System.out.println(scoreList.get(index));
		}
		
		scoreVO = new ScoreVO();
		int sum = 0;
		float avg = 0.0f;
		System.out.println("=".repeat(60));
		System.out.println("\t\t 성적리스트");
		System.out.println("-".repeat(60));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < scoreList.size() ; i++) {
			scoreVO = scoreList.get(i);
			
			sum = scoreVO.getKor() + scoreVO.getEng() + scoreVO.getMath();
			avg = (float)sum / scoreList.size();
			
			System.out.printf("%s\t%s\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", scoreVO.getNum(), scoreVO.getName(), scoreVO.getKor(), scoreVO.getEng(), scoreVO.getMath(), sum, avg );
		}
	}

}
