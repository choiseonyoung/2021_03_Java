package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;
	String strInput;
	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {
		Integer intInput = null;
		System.out.println(title + " 값을 입력하세요 ( 종료 : QUIT )");
		while (true) {
			System.out.print(">> ");
			strInput = scan.nextLine();
			if (strInput.trim().equals("QUIT")) {
				return null;
			}
			try {
				intInput = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 QUIT를 입력하세요");
				continue;
			}
			return intInput;
		}
	}

	public Integer inputValue(String title, int start) {
		Integer in = null;
		System.out.printf("%d 이상의 ", start);
		while (true) {
			in = this.inputValue(title);
			if (in != null) if (in < start) {
				System.out.printf(start + " 이상 값을 입력하세요");
				continue;
			} else {
				return in;
			}
		}

	}

	public Integer inputValue(String title, int start, int end) {
		Integer in = null;
		System.out.printf("%d ~ %d 범위의 ", start, end);
		while (true) {
			in = this.inputValue(title);
			if (in < start && in > end ) {
				System.out.printf("%d ~ %d 사이 값을 입력하세요\n", start, end);
				continue;
			} else {
				return in;
			}
		}
	}
}
