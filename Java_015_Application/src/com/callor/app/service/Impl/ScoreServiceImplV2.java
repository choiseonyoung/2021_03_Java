package com.callor.app.service.Impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	/*
	 * scoreList에 성적정보를 추가할 때
	 * 학번을 입력받을텐데
	 * 이미 등록된 학번 정보가 있으면 그 학번은 추가하지 못하도록 하는 코드
	 * 
	 * V1의 inputNum() method를 재 정의 한다
	 * V1의 inputNum() method를 재 정의 하기 위하여
	 * 		private을 protected로 변경했다
	 * 
	 */
	protected String inputNum() {
		
		while(true) {
			Integer intNum = inService.inputValue("학번", 1);

			if (intNum == null) {
				return null;
			}

			String strNum = String.format("2021%03d", intNum); // 2021001
			
			/*
			 * 생성한 strNum에 저장된 학번이 scoreList에 있는지 확인
			 */
			
			
			/*
			int index = 0;
			if (scoreList.size() != 0) {
				for(index = 0; index < scoreList.size(); index++) {
					if (strNum.equals(scoreList.get(index).getNum())) {
						strNum = "-1";
					}
				}
			}
			return strNum;
			*/
			

			int index = 0;
			// index는 0 ~ scoreList.size() - 1 반복하는 과정에서
			// 0 ~ scoreList.size() -1 에 해당한 값을 갖게 된다
			for(index = 0; index < scoreList.size(); index++) {
				ScoreVO vo = scoreList.get(index);
				if(vo.getNum().equals(strNum)) {
					break;
				}
			}
			
			// for() 반복문이 모두 정상종료 되었는지 ? : index > =size()
			// 아니면 중간에 중단되고 빠져나왔는지 ? index < size()
			// 		for() 중간에 break를 만났다. break가 실행됐다
			// 		이미 등록된 학번이 있다
			if(index < scoreList.size()) {
				System.out.println(strNum + "는 이미 등록되어 있음");
				// 다시 입력받으러 가기
				continue;
			}
			return strNum;
		} // end while
		
	}

	/*
	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		String strNum;
		
		while(true) {
			strNum = inputNum();
			if (strNum == null) {
				return;
			}else if (strNum.equals("-1")) {
				System.out.println("중복된 학번입니다 다시 입력하세요");
				continue;
			} else {
				break;
			}
		}
		
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

		ScoreVO scoreVO = new ScoreVO();

		
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		scoreList.add(scoreVO);

	}
*/
}
