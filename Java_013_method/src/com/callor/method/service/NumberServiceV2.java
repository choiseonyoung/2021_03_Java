package com.callor.method.service;

import java.util.Scanner;

/* public class NumberServiceV2 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		System.out.println("0 ~ 100까지의 정수 입력");

		while (true) {
			System.out.println(">> ");
			String strNum = scan.nextLine();
			Integer intNum = 0;

			if (strNum.equals("QUIT")) {
				return null;
			}

			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("0 ~ 100까지의 정수나 QUIT 입력");
			}

			if(intNum >= 0 && intNum <= 100) {
				return intNum;
			} else {
				System.out.println("1부터 100 사이의 정수 입력");
			}
			
		}
	}

} */

public class NumberServiceV2 {

	/*
	 * 정수를 키보드에서 입력받아
	 * 정수를 return하거나 : int
	 * QUIT를 입력하면 null을 return : AND => Integer
	 * void 대신 Integer
	 */
	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ~ 100까지의 정수 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.println(">> ");
		String strNum = scan.nextLine();

		if (strNum.equals("QUIT")) {
			return null;
		} else {
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}
	}
}
