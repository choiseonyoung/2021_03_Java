package com.callor.app.service.impl;

import java.util.Scanner;

public class ScoreServiceV2 implements com.callor.app.service.ScoreService {

	Scanner scan;

	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		System.out.println("=".repeat(50));
		System.out.println("빛고을 고교 성적처리 2021");
		System.out.println("=".repeat(50));
		System.out.println("1. 성적입력");
		System.out.println("2. 성적리스트 출력");
		System.out.println("3. 성적 저장");
		System.out.println("QUIT. 종료");
		System.out.println("-".repeat(50));
		System.out.print("업무선택 >> ");

		String strSelect;
		Integer intSelect;
		
		while (true) {
			strSelect = scan.nextLine();
			if (strSelect.trim().equals("QUIT")) {
				System.out.println("<< 업무종료 >>");
				return;
			}
			try {
				intSelect = Integer.valueOf(strSelect);
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT 입력");
				continue;
			}
			if (intSelect == 1) {
				inputScore();
			} else if (intSelect == 2) {
				printScore();
			} else if (intSelect == 3) {
				saveScore();
			}
		}

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
