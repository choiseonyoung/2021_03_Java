package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println(LinesService.dLines(50));
		System.out.println("키보드로 정수 2개를 입력하세요");
		System.out.print("정수1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		num2 = scan.nextInt();
		
		System.out.println(LinesService.sLines(50));
		
		System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));

		if (num1 >= num2) {
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		} else {
			System.out.printf("%d - %d = %d\n", num2, num1, num2 - num1);
		}

		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);

		if (num1 >= num2) {
			System.out.printf("%d / %d = %1.2f\n", num1, num2, (float)num1 / num2);
		} else {
			System.out.printf("%d / %d = %1.2f\n", num2, num1, (float)num2 / num1);
		}

		System.out.println(LinesService.dLines(50));

	}

}
