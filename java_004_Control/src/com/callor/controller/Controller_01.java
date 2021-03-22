package com.callor.controller;

public class Controller_01 {

	public static void main(String[] args) {
		
		
		int sum3 = 0, sum4 = 0, sum35 = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			if( i % 3 == 0 ) {
				sum3 += i;
				if ( i % 5 == 0 ) {
					sum35 += i;
				}
			}
			
			/*
			 * 여기에서 else if를 사용하면 3의이면서 4의 배수인 경우
			 * 3의 배수에는 합산(누적)이 되지만 4의 배수에는 누락이 된다.
			 */
			
			if( i % 4 == 0 ) {
				sum4 += i;
			}
		}
		
		System.out.println("==========================");
		System.out.printf("3의 배수의 합 : %d\n", sum3);
		System.out.printf("4의 배수의 합 : %d\n", sum4);
		System.out.printf("3과 5의 배수의 합 : %d\n", sum35);
		System.out.println("==========================");
	}
}