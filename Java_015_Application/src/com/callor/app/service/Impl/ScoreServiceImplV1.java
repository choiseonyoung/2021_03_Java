package com.callor.app.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.csy.standard.InputService;
import com.csy.standard.impl.InputServiceImplV1;

/*
 * 1. 메뉴를 보여주고
 * 2. 성적입력 : 학생수의 제한이 없다.
 * 		가. 학번
 * 		나. 학생이름 : inputName()
 * 		다. 과목별 성적 : inputScore()
 * 
 * 		가. 학생성적입력 : inputScore() 시작
 * 			- 학번입력
 * 			- 이름입력
 * 			- 점수입력
 * 		나. 학생의 이름을 입력하는 inputName() method는
 * 			return type String 형이기 때문에
 * 			학생 이름을 입력받고 입력받은 학생이름을 return 한다
 * 			이 return된 학생이름을 inputScore() 에서 변수에 담아 처리를 할 수 있다
 */
public class ScoreServiceImplV1 implements ScoreService {

	// 저장소
	protected List<ScoreVO> scoreList;

	// 학번, 점수를 입력받을 때 사용할 객체
	protected InputService inService;
	// 학생의 이름을 입력받을 때 사용할 객체
	protected Scanner scan;

	public ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO 성적처리 메뉴선택
		String selects;
		Integer select = null;

		while (true) {
			System.out.println("<< 메뉴를 선택하세요 >>");
			System.out.println("1. 성적추가 2. 성적리스트 출력 0. 업무 종료");
			System.out.print(">> ");
			selects = scan.nextLine();
			try {
				select = Integer.valueOf(selects);
			} catch (NumberFormatException e) {
				System.out.println("메뉴를 똑바로 입력하세요");
				continue;
			}
			if (select == 1) {
				inputScore();
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

	/*
	 * 현재 클래스 내부에서만 호출되는 method private으로 선언한다
	 * 현재 클래스를 상속받아 확장하여 사용할 수 있도록 하려면
	 * private => protected로 변경해주는 것이 좋다
	 */
	protected String inputNum() { // 인터페이스에 있는 method 외에 추가로 만든 함수는 외부 유출 안 되게 private로 하는 게 좋음
		// TODO 학번 입력
		// 학번입력처리 : 001, 002 형식으로 입력받자
		// 정수 1 이상을 입력하면 정수 값이 intNum에 담길 것이고
		// QUIT를 입력했으면 null값이 intNum에 담길 것이다

		Integer intNum = inService.inputValue("학번", 1);

		if (intNum == null) {
			return null;
		}

		// 정수를 입력했으면 입력받은 정수값을
		// 학번의 문자열 형식(001, 002)으로 변환을 하자
		// String.format("%3d, 1)
		// 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하는 문자열 만들기
		// " 1"
		// String.format("%03d", 1)
		// 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하고 왼쪽의 빈칸에 0을 채워라
		// "001"
		String strNum = String.format("2021%03d", intNum); // 2021001

		return strNum;
	}

	/*
	 * @Override public String inputName() { // TODO 이름 입력 String name;
	 * 
	 * System.out.println("이름을 입력하세요");
	 * 
	 * while (true) { System.out.print(">> "); name = scan.nextLine(); if (name ==
	 * "" || name == null) { System.out.println("이름을 제대로 입력하세요"); continue; } return
	 * name; } }
	 */

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가
		
		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}
		
		Integer intKor = inService.inputValue("국어", 0, 100); // 국어 점수 입력
		if (intKor == null) { // QUIT를 입력했으면 종료
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}
		
		/*
		 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난 후
		 * 한 과목이라도 QUIT하면 종료하는 코드이다
		 * 만약 국어 과목에서 QUIT를 하여도 영어, 수학 점수를 입력받는 Prompt가 나타나고
		 * 3과목을 모두 통과한 후 입력종료 된다
		 * (좋지 않은 코드)
		 */
		// if(intKor == null || intEng == null || intMath == null) {
		//	return;
		// }

		ScoreVO scoreVO = new ScoreVO(); // 학생마다 다른 VO 객체 생성
		
		// 입력을 모두 마쳤으면 VO에 담기
		scoreVO.setName(strName); // VO 객체에 이름 저장
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor); // VO 객체에 성적 저장
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		// vo에 담긴 데이터를 List 저장소에 추가
		scoreList.add(scoreVO); // i번째 학생의 학번, 이름, 성적을 scoreList에 추가

	}

	protected String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름을 입력받는 method
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT : 종료)");
			System.out.println(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return null;
			} else if (strName.equals("")) { // 입력 없이 Enter만
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			return strName;
		}
	}

	@Override
	public void printScore() {
		// TODO 리스트 출력하기
		/*
		 * for (int index = 0; index < scoreList.size(); index++) {
		 * System.out.println(scoreList.get(index)); }
		 */

		System.out.println("=".repeat(80));
		System.out.println("\t\t\t 성적리스트");
		System.out.println("-".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));

		for (int i = 0; i < scoreList.size(); i++) {
			
			ScoreVO vo = scoreList.get(i);

			System.out.printf("%s\t%s\t%3d\t%3d\t%3d\t%3d\t%3.2f\n", vo.getNum(), vo.getName(),
					vo.getKor(), vo.getEng(), vo.getMath(), vo.getTotal(), vo.getAvg());
		}
		System.out.println("=".repeat(80));
	}

	@Override
	public void inputName() {
		// TODO Auto-generated method stub
		this.inputName("무명");

	}

}
