package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	protected Random rnd;
	
	public PrimeServiceV1() {
		rnd = new Random();
	}
	
	public void primeNum() {
		int ran = rnd.nextInt(51)+50;
		int i = 0;
		/*
		 * for() 반복문이 종료되면 i 값은 얼마일까?
		 * i 값이 ran보다 작으면 { } 내의 코드 실행
		 * { } 실행 후에 i++를 실행한다
		 * i 가 9가 되었을 때 { } 을 실행하고 다시 한번 i++ 실행된다.
		 * 때문에 for() 반복문이 중단되지 않고 모두 정상 수행이 되면
		 * 		"i 값은 ran값과 같아진다"
		 * 		i == ran 인데 i < ran 냐고 묻는 것
		 * 		-> false가 돼서 반복문 중단
		 * 
		 * 만약 for() 반복문이 중간에 break를 만났다
		 * 		"i 값은 항상 ran보다 작다"
		 */
		// ran이 6이라고 가정하자
		// 6 % 2, 6 % 3, 6 % 4, 6 % 5 연산을 수행
		// ran이 100이라고 가정하자
		boolean notPrime = false;
		for (i = 2 ; i < ran ; i++) {
			if(ran%i == 0) { // 소수가 아닌 경우
				// 소수가 아닌 경우
				// ran을 i값들로 나머지 연산을 했을 때
				// 한번이라도 나머지가 0이면 그 수는 소수가 아닌 경우이다
				// 그렇다면 그 이후에는 더이상 연산을 할 필요가 없다
				System.out.println(ran + "은 소수가 아님");
				notPrime = true;
				break;
			}
		} // for() end
		// 여기에서 for() 반복문이 break 되었냐?
		// 		소수가 아니다
		// 아니면 모두 완료되었냐?
		// 		소수이다
		
		if(notPrime == true) {
			System.out.println("소수가 아님");
		} else {
			System.out.println("소수임");
		}
		
		
		/*if(i == ran) {
			System.out.println(ran + "은 소수");
		}*/
	}
}