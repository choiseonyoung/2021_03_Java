package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.csy.standard.InputService;
import com.csy.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected InputService inService;
	protected StudentService stService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
		stService = new StudentServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	/*
	 * 
	 * 학번입력하면 scoreList에 같은 학번의 성적이 있는지 확인하여
	 * 있으면 저장이 안되게 이미 있으면 다시 학번을 입력하도록 해야 한다
	 * 
	 */
	@Override
	public void insertScore() {
		// TODO 성적입력

		// 유효성검사가 끝난 후 학번을 가지고
		// VO에 담아야 하기 때문에 while() 전에 선언
		String strNum = null;
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return;
			}
			// 00001 형식으로 학번 변환(생성)
			strNum = String.format("%05d", intNum);

			// 이미 등록된 학번인가를 검사
			ScoreVO scoreVO = this.numCheck(strNum);
			if (scoreVO != null) {
				continue;
			}
			// 여기에 도달하면
			// 학번에 해당하는 점수가 list에 없다!!
			// 학생정보에 등록된 학번인가를 검사하여
			// 학생정보에 없으면 다시 학번을 입력받고
			// 있으면 점수를 입력하도록 break;
			StudentVO stVO = stService.getStudent(strNum);
			if (stVO == null) {
				System.out.println("학적부에 없는 학생입니다!!");
				System.out.println("학번을 다시 입력해 주세요");
				continue;
			}

			// 여기 도달하면 학적부에 있는 학번이다
			System.out.println("=".repeat(30));
			System.out.printf("학번:%s\n", stVO.getNum());
			System.out.printf("이름:%s\n", stVO.getName());
			System.out.printf("학과:%s\n", stVO.getDept());
			System.out.printf("학년:%s\n", stVO.getGrade());
			System.out.printf("주소:%s\n", stVO.getAddress());
			System.out.println("=".repeat(30));
			System.out.println("학생정보가 맞습니까 ?");
			System.out.println("맞으면 : Enter, 틀리면 : NO");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if (yesNo.equals("NO")) {
				continue;
			}
			
			break;
		} // 학번입력 끝

		// 성적입력 부분...
		Integer intKor = null;
		Integer intEng = null;
		Integer intMath = null;
		
		intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		intEng = inService.inputValue("영어", 0, 100);
		if (intKor == null) {
			return;
		}
		intMath = inService.inputValue("수학", 0, 100);
		if (intKor == null) {
			return;
		}
		

		// 위에서 담겨있던 데이터는 clear되고
		// 새로운 scoreVO가 생성된다
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreList.add(scoreVO);

	} // end insertScore()

	// 파라메터로 전달받은 학번이 scoreList에 있는지 검사
	// 있으면 scoerVO를 return
	// 없으면 null을 return
	protected ScoreVO numCheck(String num) {
		for (ScoreVO vo : scoreList) {
			if (vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
	}

	@Override
	public void printScore() {
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		int nSize = scoreList.size();
		
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO scoreVO = new ScoreVO();
			scoreList.get(i);
			System.out.print("%s\t%s\t%s\t%s\t");
			System.out.printf("%3d\t%3d\t%3d\t%3d\t%3f\n", scoreVO.getKor(), scoreVO.getEng(), scoreVO.getMath(), scoreVO.getTotal(), scoreVO.getAvg() );
		}
		System.out.println();
		System.out.println("=".repeat(80));

	}

}