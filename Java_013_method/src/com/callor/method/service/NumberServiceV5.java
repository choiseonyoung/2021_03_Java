package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {

		Scanner scan = new Scanner(System.in);


		while (true) {
			System.out.println(title + "값을 입력하세요");
			System.out.println("0 ~ 100까지의 정수 입력");
			System.out.println("QUIT 입력하면 종료");
			System.out.println(">> ");
			String strNum = scan.nextLine();
			Integer intNum = null;

			if (strNum.trim().equals("QUIT")) {
				System.out.println("종료합니다");
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수 또는 QUIT만 입력");
					continue;
				}
				if (intNum < 0 || intNum > 100) {
					System.out.println("범위를 벗어났음");
					System.out.println("0 ~ 100까지만 입력");
					continue;
				}
				return intNum;
			}
		}
	}

}
