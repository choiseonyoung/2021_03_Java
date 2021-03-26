package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {

		int[] nums = new int[5];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(LinesService.dLines(50));
		System.out.println("< 키보드로 정수 5개를 입력하세요 >");
		for(int i = 0; i<nums.length ; i++) {
			System.out.printf("정수%d >> ", i+1);
			nums[i] = scan.nextInt();
		}
		
		System.out.println(LinesService.sLines(50));
		
		System.out.println("< 정수 리스트 >");
		for(int i = 0; i<nums.length; i++) {
			System.out.printf("%d\n", nums[i]);
		}
		// ==> System.out.println(Arrays.toString(nums));
		
		System.out.println(LinesService.sLines(50));
		
		System.out.println("< 정수들의 합 >");
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.printf("%d\n", sum);
		
		System.out.println(LinesService.dLines(50));

	}

}
