package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0 ~ 100까지의 정수 입력");
			System.out.println("QUIT 입력하면 종료");
			System.out.println(">> ");
			String strNum = scan.nextLine();
			Integer intNum = null;

			if (strNum.trim().equals("QUIT")) {
				System.out.println("종료합니다");
				return null;
			} else {
				
				// 1. 입력된 값이 QUIT가 아니면 일단 정수로 바꿔보자
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("값은 숫자만 입력하세요");
					// 다시 입력하는 곳으로
					continue;
				}

				// 2. 정수이면 0 ~ 100까지인지 알아보자
				if (intNum < 0 || intNum > 100) {
					System.out.println("범위를 벗어났음");
					System.out.println("0 ~ 100까지만 입력");
					// 다시 입력하는 곳으로
					continue;
				}
				return intNum;
			}
		}

	}

}
