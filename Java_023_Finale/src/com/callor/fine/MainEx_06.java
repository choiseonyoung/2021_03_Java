package com.callor.fine;

import java.util.List;

import com.callor.fine.model.ScoreVO;

public class MainEx_06 {
	public static void main(String[] args) {
		List<ScoreVO> scoreList = null;
		for (int i = 0; i < 10; i++) {
			ScoreVO scoreVO = null;
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			scoreList.add(scoreVO);
		}
	}
}

// 왜 널포인트익셉션 오류가 날까

// 나머지 코드는 완성해보기