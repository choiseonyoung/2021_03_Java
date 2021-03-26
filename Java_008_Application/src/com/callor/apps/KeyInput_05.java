package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println(LinesService.dLines(40));
		System.out.print("정수를 입력하세요\n>> ");
		num = scan.nextInt();
		System.out.println(LinesService.dLines(40));
		
		if ( num % 2 == 0 ) {
			System.out.println("입력한 정수 " + num + "은(는) 짝수입니다");
		} else {
			System.out.println("입력한 정수 " + num + "은(는) 짝수가 아닙니다");
		}
		
		for (int i = 2 ; i < num ; i++) {
			if ( num % i == 0) {
				System.out.println("입력한 정수 " + num + "은(는) 소수가 아닙니다");
				break;
			}
			if ( i == num-1 ) {
				System.out.println("입력한 정수 " + num + "은(는) 소수입니다");
			}
		}
		
		System.out.println(LinesService.dLines(40));

	}

}
