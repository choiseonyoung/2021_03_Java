package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.csy.standard.InputService;
import com.csy.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected InputService inService;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected String[] subject;
	protected Integer[] subScore;
	
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
		subScore = new Integer[subject.length];
	}
	
	@Override
	public void inputScore() {
		
		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("2021%03d", intNum);
		
		String strName = null;
		while (true) {
			System.out.println(strNum + "번 학생의 이름 입력 (QUIT:중단)");
			strName = scan.nextLine();
			if (strName.trim().equals("QUIT")) {
				return;
			}
			if (strName.equals("")) {
				System.out.println("학생 이름은 반드시 입력하세요");
				continue;
			}
			break;
		}
		
		for (int i = 0; i < subject.length; i++) {
			Integer intScore = inService.inputValue(subject[i], 0, 100);
			if(intScore == null) {
				return;
			}
			subScore[i] = intScore;
		}
		
		ScoreVO vo = new ScoreVO();
		
		vo.setNum(strNum);
		vo.setName(strName);
		vo.setKor(subScore[국어]);
		vo.setEng(subScore[영어]);
		vo.setMath(subScore[수학]);
		scoreList.add(vo);
	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(80));
	}

	@Override
	public void saveScore() {
		String fileName = null;
		while(true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">> ");
			fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력해야 합니다");
				continue;
			}
			break;
		}
		String strFileName = "src/com/callor/score" + fileName;
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = scoreList.size();
			for(int i = 0; i < nSize ; i++) {
				ScoreVO vo = scoreList.get(i);
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n",vo.getAvg());
			}
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
