package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV1 {

	/*
	 * Scanner class는 키보드 자원을 연동하여 키보드로부터 값을 입력받기 위한 클래스이다 이 클래스는 컴퓨터의 자원을 사용하는 관리가
	 * 매우 엄격하게 필요한 클래스이다 사용하는 방법에 따라 오류가 발생하거나 심지어 컴퓨터 시스템이 멈추는 현상까지 발생할 수 있다 이러한
	 * 클래스는 사용할 때 상당한 주의가 필요하다
	 */
	// Scanner 클래스를 main() method가 아닌 Service 등의 클래스에서 사용할 때는
	// 클래스 영역에 선언을 하고
	// 클래스의 생성자에서 생성(초기화)를 하는 것이 좋다

	protected Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	/*
	 * 문자열, 정수, 정수 매개변수를 갖는 method 선언
	 * 
	 * 문자열과 범위(start ~ end)값을 전달받아 prompt 문자열을 생성하고 inputValue(String title) method를
	 * 호출하여 값을 입력받도록 하고 return 된 값에 따라 null이 return되면 그냥 return 해버리고 정수값이 return 되면
	 * start, end 값 범위에 있는 값인지 유효성 검사를 하고 범위를 벗어나면 다시 입력하도록 반복한다
	 */
	public Integer inputValue(String title, int start, int end) {

		// title 변수값을 "새우깡( 0 ~ 100 )" 문자열로 다시 생성
		title = String.format("%s (%d ~ %d)", title, start, end);

		while (true) {

			Integer retNum = this.inputValue(title);
			if (retNum == null) {
				return null;
			} else {
				if (retNum < start || retNum > end) {
					System.out.printf("입력값은 %d ~ %d 범위이어야 한다\n", start, end);
					continue;
				}
			}

			return retNum;
		}
	}

	/*
	 * String title 매개변수를 받고 정수값이나 QUIT가 입력되는지 확인을 하고 잘못 입력된 값이 있으면 다시 입력받도록 하는
	 * method
	 */
	public Integer inputValue(String title) {

		System.out.println(title + "값을 입력하세요(QUIT:입력중단)");

		Integer intNum = null;
		while (true) {
			System.out.print(">> ");
			String strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수 또는 QUIT 입력");
					continue;
				}
				return intNum;
			}
		}

	}

	public void inputScore() {

		Integer score = inputValue("국어", 0, 100);

		if (score == null) {
			System.out.println("종료");
		} else {
			System.out.printf("점수 : %d", score);
		}
	}

}
