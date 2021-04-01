package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	protected Scanner scan;
	protected List<NumberVO> numList;
	
	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}
	
	public void inputNum() {
		Integer intNum1;
		Integer intNum2;
		System.out.println("정수 2개를 입력하세요");
		System.out.println("정수1 >> ");
		String strNum1 = scan.nextLine();
		intNum1 = Integer.valueOf(strNum1);
		while ( true ) {
			System.out.println("정수2 >> ");
			String strNum2 = scan.nextLine();
			intNum2 = Integer.valueOf(strNum2);
			if(intNum2 >= intNum1) {
				System.out.println("정수1보다 작은 값을 입력하세요");
				continue;
			} else {
				break;
			}
		}
		
		NumberVO numberVO = new NumberVO();
		numberVO.setNum1(intNum1);
		numberVO.setNum2(intNum2);;
		numList.add(numberVO);
	}
	
	public void printNum() {
		NumberVO vo = new NumberVO();
		System.out.print("두 정수의 뺄셈 : ");
		for (int i = 0 ; i < numList.size(); i++) {
			vo = numList.get(i);
			System.out.println(vo.getNum1() - vo.getNum2());
		}
		
	}
	
}
