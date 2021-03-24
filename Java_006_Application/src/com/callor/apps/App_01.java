package com.callor.apps;

/*
 * 정수형 배열을 20개 선언
 * 짝수들의 리스트 출력
 * 짝수들의 합을 계산하여 출력
 */

import java.util.Random;

public class App_01 {
	
	/*
	 * { } 내에 있는 코드는 최소화 하자
	 * 작은 일들로 분해하기
	 * 
	 * 나누어서 정복하라 : Divide and Conquer
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 배열의 크기를 변수에 설정해 두고 코드 내에서 공통으로 사용하기
		 */
		int numsLength = 20;
		
		Random rnd = new Random();
		
		int[] num = new int[numsLength];
		
		int i = 0;
		int evenSum = 0;
		
		System.out.print("짝수 리스트 : ");
		
		
		// 값을 배열에 저장하기
		while(i < numsLength) {
			num[i] = rnd.nextInt(100) + 1;
			i++;
		}
		

		// 짝수들의 리스트 출력하기
		for(int j = 0; j < numsLength; j++) {
			if(num[j] % 2 == 0) {
				System.out.printf("%d ", num[j]);
			}
		}
		
		
		//합계 계산하기
		// intSum에 이전 코드에서 어떤 값이 저장되어 있을지도 모르기 때문에 clear하고 시작
		evenSum = 0;
		for(int j = 0; j < numsLength; j++) {
			if(num[j] % 2 == 0) {
				evenSum += num[j];
			}
		}
		
		
		// 합계 출력하기
		System.out.printf("\n짝수들의 합 : %d", evenSum);
	}

}
